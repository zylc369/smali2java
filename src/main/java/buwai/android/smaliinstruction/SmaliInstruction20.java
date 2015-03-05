package buwai.android.smaliinstruction;

/**
 * 

44: aget
45: aget-wide
46: aget-object
47: aget-boolean
48: aget-byte
49: aget-char
4a: aget-short

 * @author buwai
 *
 */
public class SmaliInstruction20 {

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
		case 0x44:
			return vA + " = " + vB + "[" + vC + "];";
		case 0x45:
			return vA + " = (wide)(" + vB + "[" + vC + "]);";
		case 0x46:
			return vA + " = (object)(" + vB + "[" + vC + "]);";
		case 0x47:
			return vA + " = (boolean)(" + vB + "[" + vC + "]);";
		case 0x48:
			return vA + " = (byte)(" + vB + "[" + vC + "]);";
		case 0x49:
			return vA + " = (char)(" + vB + "[" + vC + "]);";
		case 0x4a:
			return vA + " = (short)(" + vB + "[" + vC + "]);";
		default:
			return null;
		}
	}
	
}
