package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 
 1c. const-class vAA, type@BBBB -> <类>.class
 * 
 * @author buwai
 *
 */
public class SmaliInstruction04 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		// endIndex + 1表示跳过逗号。
		String className = Utils.getJavaType(smaliInst.substring(endIndex + 1).trim());
		return vA + " = " + className + ".class;";
	}

}
