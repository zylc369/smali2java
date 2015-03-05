package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 

59: iput
5a: iput-wide
5b: iput-object
5c: iput-boolean
5d: iput-byte
5e: iput-char
5f: iput-short

 * @author buwai
 *
 */
public class SmaliInstruction23 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vB = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = smaliInst.lastIndexOf(',') + 1;
		endIndex = smaliInst.lastIndexOf("->");
		String instanceName = Utils.getJavaType(smaliInst.substring(beginIndex, endIndex).trim());
		
		beginIndex = endIndex + 2;
		endIndex = smaliInst.lastIndexOf(':');
		String fieldName = smaliInst.substring(beginIndex, endIndex).trim();
		
		String fieldType = Utils.getJavaType(smaliInst.substring(endIndex + 1).trim());
		
		switch (id) {
		case 0x59:
		case 0x5a:
		case 0x5b:
		case 0x5c:
		case 0x5d:
		case 0x5e:
		case 0x5f:
			return fieldType + " ((" + instanceName + ")" + vB + ")->" + fieldName + " = " + vA + ";";
		default:
			return null;
		}
	}
	
}
