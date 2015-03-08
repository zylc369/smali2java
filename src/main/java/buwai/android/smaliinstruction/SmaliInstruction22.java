package buwai.android.smaliinstruction;

import buwai.android.smali2java.Utils;

/**
 * 

52: iget
53: iget-wide
54: iget-object
55: iget-boolean
56: iget-byte
57: iget-char
58: iget-short

 * @author buwai
 *
 */
public class SmaliInstruction22 {

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
		case 0x52:
		case 0x53:
		case 0x54:
		case 0x55:
		case 0x56:
		case 0x57:
		case 0x58:
			return String.format("%s %s = ((%s)%s)->%s;", fieldType, vA, instanceName, vB, fieldName);
		default:
			return null;
		}
	}
	
}
