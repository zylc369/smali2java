package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 
22. new-instance vAA, type@BBBB
 * @author buwai
 *
 */
public class SmaliInstruction10 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		String className = Utils.getJavaType(smaliInst.substring(smaliInst.lastIndexOf(',') + 1).trim());
		
		return String.format("%s = new %s;", vA, className);
	}
	
}
