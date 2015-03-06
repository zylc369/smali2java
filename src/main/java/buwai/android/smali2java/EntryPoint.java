package buwai.android.smali2java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Hello world!
 *
 */
public class EntryPoint {

	private static Options options;

	static {
		options = new Options();
		options.addOption("h", false, "使用帮助");
		options.addOption("s", true, "单个文件");
		options.addOption("m", true, "多个文件");
		options.addOption("d", true, "目录，将递归目录中的所有smali文件");
		options.addOption("o", true, "输出路径。当设置-s: 需要输入完整路径。当设置-d和-m: 应为目录的路径。");
	}

	public static void main(String[] args) {
		System.out.println("------ 开始 ------");
		BasicParser parser = new BasicParser();
		CommandLine cl = null;
		try {
			cl = parser.parse(options, args);

			if (cl.hasOption('h')) {
				usage();
			}

			// dex路径。
			File singleFile = null;
			if (cl.hasOption('s')) {
				singleFile = new File(cl.getOptionValue('s'));
			}

			List<File> mutiFile = null;
			if (cl.hasOption('m')) {
				mutiFile = getFiles(cl.getOptionValue('m'));
			}

			File dir = null;
			if (cl.hasOption('d')) {
				dir = new File(cl.getOptionValue('d'));
			}

			File out = null;
			if (cl.hasOption('o')) {
				out = new File(cl.getOptionValue('o'));
			}

			if (null == out) {
				usage();
			}

			if (null == singleFile && null == mutiFile && null == dir) {
				usage();
			}

			if (null != singleFile) {
				Smali2JavaFile smali2JavaFile = new Smali2JavaFile(singleFile);
				smali2JavaFile.toJava(out);
			} else if (null != mutiFile) {
				for (File file : mutiFile) {
					Smali2JavaFile smali2JavaFile = new Smali2JavaFile(singleFile);
					smali2JavaFile.toJava(new File(out, file.getName()));
				}
			} else if (null != dir) {
				filelist.clear();
				getFileList(dir, ".smali");
				int rootPathLength = dir.getAbsolutePath().length();
				for (File file : filelist) {
					String path = file.getAbsolutePath();
					File outFile = new File(out + File.separator + path.substring(rootPathLength + 1));
					File newOutFile = outFile.getParentFile();
					if (!newOutFile.exists()) {
						newOutFile.mkdirs();
					}
					Smali2JavaFile smali2JavaFile = new Smali2JavaFile(file);
					smali2JavaFile.toJava(outFile);
				}
			}

			System.out.println("------ 结束 ------");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 用法。
	 */
	private static void usage() {
		HelpFormatter help = new HelpFormatter();
		help.printHelp("-s <输入文件> -o <输出文件>", options);
		help.printHelp("-m <多个文件以分号';'分隔> -o <输出目录>", options);
		help.printHelp("-d <目录> -o <输出目录>", options);
		System.exit(-1);
	}

	/**
	 * 获得所有的文件。
	 * 
	 * @param apks
	 * @return
	 */
	private static List<File> getFiles(String apks) {
		List<File> apkPaths = new ArrayList<File>();
		String[] paths = apks.split(";");
		int length = paths.length;
		for (int i = 0; i < length; i++) {
			apkPaths.add(new File(paths[i]));
		}
		return apkPaths;
	}
	
	private static List<File> filelist = new ArrayList<File>();
	
	/**
	 * 递归获得目录中的所有文件。
	 * @param dir 根目录。
	 * @param extensions 扩展名。如：".txt"。
	 */
	public static void getFileList(File dir, String extensions) {
		File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String fileName = files[i].getName();
				if (files[i].isDirectory()) { // 判断是文件还是文件夹
					getFileList(files[i], extensions); // 获取文件绝对路径
				} else if (fileName.endsWith(extensions)) { // 判断文件名是否以.avi结尾
					//String strFileName = files[i].getAbsolutePath();
					//System.out.println("---" + strFileName);
					filelist.add(files[i]);
				} else {
					continue;
				}
			}

		}
	}
}
