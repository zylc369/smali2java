package buwai.android.smali2java;

import java.io.File;

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
		options.addOption("d", true, "目录");
		options.addOption("o", true, "输出路径。如果输入为单个文件，这里需要输入完整路径。如果输入为目录，这个路径应为目录的路径。");
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
			
			File out = null;
			if (cl.hasOption('o')) {
				out = new File(cl.getOptionValue('o'));
			}
			
			if (null == out) {
				usage();
			}
			
			if (null == singleFile) {
				usage();
			}
			
			if (null != singleFile) {
				Smali2JavaFile smali2JavaFile = new Smali2JavaFile(singleFile);
				smali2JavaFile.toJava(out);
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
		System.exit(-1);
	}
}
