package buwai.android.smaliinstruction;

/**
 * 

7b: neg-int
7c: not-int
7d: neg-long
7e: not-long
7f: neg-float
80: neg-double

 * @author buwai
 *
 */
public class SmaliInstruction27 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',');
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		String vB = smaliInst.substring(endIndex + 1);
		switch (id) {
		case 0x7b:
			return String.format("%s = -((int)%s);", vA, vB);
		case 0x7c:
			return smaliInst;
		case 0x7d:
			return String.format("%s,%s+1 = -((long)(%s,%s+1));", vA, vA, vB, vB);
		case 0x7e:
			return smaliInst;
		case 0x7f:
			return String.format("%s = -((float)%s);", vA, vB);
		case 0x80:
			return String.format("%s,%s+1 = -((double)(%s,%s+1));", vA, vA, vB, vB);
		default:
			return null;
		}
	}
	
}
