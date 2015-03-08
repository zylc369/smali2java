package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 

67: sput
68: sput-wide
69: sput-object
6a: sput-boolean
6b: sput-byte
6c: sput-char
6d: sput-short

 * @author buwai
 *
 */
public class SmaliInstruction25 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf("->", beginIndex);
		String className = Utils.getJavaType(smaliInst.substring(beginIndex, endIndex).trim());
		
		beginIndex = endIndex + 2;
		endIndex = smaliInst.lastIndexOf(':');
		String fieldName = smaliInst.substring(beginIndex, endIndex).trim();
		
		String fieldType = Utils.getJavaType(smaliInst.substring(endIndex + 1).trim());
		
		switch (id) {
		case 0x67:
		case 0x68:
		case 0x69:
		case 0x6a:
		case 0x6b:
		case 0x6c:
		case 0x6d:
			return String.format("%s->%s = (%s) %s;", className, fieldName, fieldType, vA);
		default:
			return null;
		}
	}
	
}
