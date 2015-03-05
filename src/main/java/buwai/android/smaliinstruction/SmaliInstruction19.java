package buwai.android.smaliinstruction;

/**
 * 

38. if-eqz
39. if-nez
3a. if-ltz
3b. if-gez
3c. if-gtz
3d. if-lez

 * @author buwai
 *
 */
public class SmaliInstruction19 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;

		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		String target = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0x38:
			return "if(" + vA + " == 0) then " + target;
		case 0x39:
			return "if(" + vA + " != 0) then " + target;
		case 0x3a:
			return "if(" + vA + " < 0) then " + target;
		case 0x3b:
			return "if(" + vA + " >= 0) then " + target;
		case 0x3c:
			return "if(" + vA + " > 0) then " + target;
		case 0x3d:
			return "if(" + vA + " <= 0) then " + target;
		default:
			return null;
		}
	}
	
}
