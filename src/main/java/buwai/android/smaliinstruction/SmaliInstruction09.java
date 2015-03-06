package buwai.android.smaliinstruction;

/**
 * 

21. array-length vA, vB

 * @author buwai
 *
 */
public class SmaliInstruction09 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		String vB = smaliInst.substring(endIndex + 1).trim();
		
		return vA + " = " + "array_size(" + vB + ");";
	}
	
}
