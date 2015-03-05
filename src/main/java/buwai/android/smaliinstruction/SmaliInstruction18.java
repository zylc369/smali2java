package buwai.android.smaliinstruction;

/**
 * 

32. if-eq
33. if-ne
34. if-lt
35. if-ge
36. if-gt
37. if-le

 * @author buwai
 *
 */
public class SmaliInstruction18 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;

		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf(',', beginIndex);
		String vB = smaliInst.substring(beginIndex, endIndex).trim();
		
		String target = smaliInst.substring(endIndex + 1).trim();
		switch (id) {
		case 0x32:
			return "if(" + vA + " == " + vB + ") then " + target;
		case 0x33:
			return "if(" + vA + " != " + vB + ") then " + target;
		case 0x34:
			return "if(" + vA + " < " + vB + ") then " + target;
		case 0x35:
			return "if(" + vA + " >= " + vB + ") then " + target;
		case 0x36:
			return "if(" + vA + " > " + vB + ") then " + target;
		case 0x37:
			return "if(" + vA + " <= " + vB + ") then " + target;
		default:
			return null;
		}
	}
	
}
