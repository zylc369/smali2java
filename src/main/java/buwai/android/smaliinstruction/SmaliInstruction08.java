package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 
 20. instance-of vA, vB, type@CCCC
 * 
 * @author buwai
 *
 */
public class SmaliInstruction08 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		// endIndex + 1表示跳过逗号。
		String vB = smaliInst.substring(endIndex + 1, smaliInst.indexOf(',', endIndex + 1)).trim();
		
		String className = Utils.getJavaType(smaliInst.substring(smaliInst.lastIndexOf(',') + 1).trim());
		return String.format("%s = %s instanceof %s;", vA, vB, className);
	}

}
