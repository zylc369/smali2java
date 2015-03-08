package buwai.android.smaliinstruction;

/**
 * 

81: int-to-long
82: int-to-float
83: int-to-double
84: long-to-int
85: long-to-float
86: long-to-double
87: float-to-int
88: float-to-long
89: float-to-double
8a: double-to-int
8b: double-to-long
8c: double-to-float
8d: int-to-byte
8e: int-to-char
8f: int-to-short

 * @author buwai
 *
 */
public class SmaliInstruction28 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.lastIndexOf(',');
		
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		String vB = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0x81:
			return String.format("long %s,%s+1 = int:%s;", vA, vA, vB);
		case 0x82:
			return String.format("float %s = int:%s;", vA, vB);
		case 0x83:
			return String.format("double %s,%s+1 = int:%s;", vA, vA, vB);
		case 0x84:
			return String.format("int %s = long:%s,%s+1;", vA, vB, vB);
		case 0x85:
			return String.format("float %s = long:%s,%s+1;", vA, vB, vB);
		case 0x86:
			return String.format("double %s,%s+1 = long:%s,%s+1;", vA, vA, vB, vB);
		case 0x87:
			return String.format("int %s = float:%s;", vA, vB);
		case 0x88:
			return String.format("long %s,%s+1 = float:%s", vA, vA, vB);
		case 0x89:
			return String.format("double %s,%s+1 = float:%s;", vA, vA, vB);
		case 0x8a:
			return String.format("int %s = double:%s,%s+1;", vA, vB, vB);
		case 0x8b:
			return String.format("long %s,%s+1 = double:%s,%s+1;", vA, vA, vB, vB);
		case 0x8c:
			return String.format("float %s = double:%s,%s+1;", vA, vB, vB);
		case 0x8d:
			return String.format("byte %s = int:%s;", vA, vB);
		case 0x8e:
			return String.format("char %s = int:%s;", vA, vB);
		case 0x8f:
			return String.format("short %s = int:%s;", vA, vB);
		default:
			return null;
		}
	}
	
}
