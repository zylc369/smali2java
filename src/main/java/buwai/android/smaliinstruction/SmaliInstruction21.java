package buwai.android.smaliinstruction;

/**
 * 

4b: aput
4c: aput-wide
4d: aput-object
4e: aput-boolean
4f: aput-byte
50: aput-char
51: aput-short

 * @author buwai
 *
 */
public class SmaliInstruction21 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;

		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf(',', beginIndex);
		String vB = smaliInst.substring(beginIndex, endIndex).trim();
		
		String vC = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0x4b:
			return vB + "[" + vC + "] = " + vA;
		case 0x4c:
			return vB + "[" + vC + "] = (wide)" + vA;
		case 0x4d:
			return vB + "[" + vC + "] = (object)" + vA;
		case 0x4e:
			return vB + "[" + vC + "] = (boolean)" + vA;
		case 0x4f:
			return vB + "[" + vC + "] = (byte)" + vA;
		case 0x50:
			return vB + "[" + vC + "] = (char)" + vA;
		case 0x51:
			return vB + "[" + vC + "] = (short)" + vA;
		default:
			return null;
		}
	}
	
}
