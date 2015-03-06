package buwai.android.smaliinstruction;

/**
 * 
 01. move vA, vB -> vA = vB; 02. move/from16 vAA, vBBBB -> vA = vB; 03.
 * move/16 vAAAA, vBBBB -> vA=vB;
 * 
 * 04. move-wide vA, vB -> vA,v(A+1) = vB,v(B+1); 05. move-wide/from16 vAA,
 * vBBBB -> vA,v(A+1) = vB,v(B+1); 06. move-wide/16 vAAAA, vBBBB -> vA,v(A+1) =
 * vB,v(B+1);
 * 
 * 07. move-object vA, vB -> Object vA = vB; 08. move-object/from16 vAA, vBBBB
 * -> Object vA = vB; 09. move-object/16 vAAAA, vBBBB -> Object vA = vB;
 * 
 * @author buwai
 *
 */
public class SmaliInstruction01 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;

		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();

		beginIndex = endIndex + 1;
		String vB = smaliInst.substring(beginIndex).trim();
		switch (id) {
		case 0x1:
		case 0x2:
		case 0x3:
			return vA + " = " + vB + ";";
		case 0x4:
		case 0x5:
		case 0x6:
			return String.format("%s, %s(%s+1) = %s, %s(%s+1)", vA, vA.substring(0, 1), vA.substring(1), vB,
					vB.substring(0, 1), vB.substring(1));
		case 0x7:
		case 0x8:
		case 0x9:
			return "Object " + vA + " = " + vB + ";";
		default:
			return null;
		}
	}

}
