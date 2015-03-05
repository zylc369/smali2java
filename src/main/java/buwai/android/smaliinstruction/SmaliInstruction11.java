package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 
23. new-array vA, vB, type@CCCC
 * @author buwai
 *
 */
public class SmaliInstruction11 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		// endIndex + 1表示跳过逗号。
		String vB = smaliInst.substring(endIndex + 1, smaliInst.indexOf(',', endIndex + 1)).trim();
		
		String className = smaliInst.substring(smaliInst.lastIndexOf(',') + 1).trim();
		if ('[' == className.charAt(0)) {
			className = Utils.toArrayTypeSimple(className);
		} else {
			className = className.substring(1, className.lastIndexOf(';')).replace('/', '.');
		}
		return vA + " = new " + className + "[" + vB + "]" + ";";
	}
	
}
