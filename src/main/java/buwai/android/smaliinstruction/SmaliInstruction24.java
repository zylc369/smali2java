package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 

60: sget
61: sget-wide
62: sget-object
63: sget-boolean
64: sget-byte
65: sget-char
66: sget-short

 * @author buwai
 *
 */
public class SmaliInstruction24 {

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
		case 0x60:
		case 0x61:
		case 0x62:
		case 0x63:
		case 0x64:
		case 0x65:
		case 0x66:
			return String.format("%s %s = %s->%s;", fieldType, vA, className, fieldName);
		default:
			return null;
		} 
	}
	
}
