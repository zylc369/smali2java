package buwai.android.smaliinstruction;

/**
 * 

90: add-int
91: sub-int
92: mul-int
93: div-int
94: rem-int
95: and-int
96: or-int
97: xor-int
98: shl-int
99: shr-int
9a: ushr-int
9b: add-long
9c: sub-long
9d: mul-long
9e: div-long
9f: rem-long
a0: and-long
a1: or-long
a2: xor-long
a3: shl-long
a4: shr-long
a5: ushr-long
a6: add-float
a7: sub-float
a8: mul-float
a9: div-float
aa: rem-float
ab: add-double
ac: sub-double
ad: mul-double
ae: div-double
af: rem-double

 * @author buwai
 *
 */
public class SmaliInstruction29 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',');
		
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf(',', beginIndex);
		String vB = smaliInst.substring(beginIndex, endIndex).trim();
		String vC = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0x90:
			return String.format("int:%s = %s + %s;", vA, vB, vC);
		case 0x91:
			return String.format("int:%s = %s - %s;", vA, vB, vC);
		case 0x92:
			return String.format("int:%s = %s * %s;", vA, vB, vC);
		case 0x93:
			return String.format("int:%s = %s / %s;", vA, vB, vC);
		case 0x94:
			return String.format("int:%s = %s %% %s;", vA, vB, vC);
		case 0x95:
			return String.format("int:%s = %s & %s;", vA, vB, vC);
		case 0x96:
			return String.format("int:%s = %s | %s;", vA, vB, vC);
		case 0x97:
			return String.format("int:%s = %s ^ %s;", vA, vB, vC);
		case 0x98:
			return String.format("int:%s = %s << %s;", vA, vB, vC);
		case 0x99:
			return String.format("int:%s = %s >> %s;", vA, vB, vC);
		case 0x9a:
			return String.format("int:%s = %s >>> %s;", vA, vB, vC);
			
		case 0x9b:
			return String.format("long:%s,%s+1 = (%s,%s+1) + (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0x9c:
			return String.format("long:%s,%s+1 = (%s,%s+1) - (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0x9d:
			return String.format("long:%s,%s+1 = (%s,%s+1) * (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0x9e:
			return String.format("long:%s,%s+1 = (%s,%s+1) / (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0x9f:
			return String.format("long:%s,%s+1 = (%s,%s+1) %% (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa0:
			return String.format("long:%s,%s+1 = (%s,%s+1) & (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa1:
			return String.format("long:%s,%s+1 = (%s,%s+1) | (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa2:
			return String.format("long:%s,%s+1 = (%s,%s+1) ^ (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa3:
			return String.format("long:%s,%s+1 = (%s,%s+1) << (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa4:
			return String.format("long:%s,%s+1 = (%s,%s+1) >> (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xa5:
			return String.format("long:%s,%s+1 = (%s,%s+1) >>> (%s,%s+1);", vA, vA, vB, vB, vC, vC);
			
		case 0xa6:
			return String.format("float:%s = %s + %s;", vA, vB, vC);
		case 0xa7:
			return String.format("float:%s = %s - %s;", vA, vB, vC);
		case 0xa8:
			return String.format("float:%s = %s * %s;", vA, vB, vC);
		case 0xa9:
			return String.format("float:%s = %s / %s;", vA, vB, vC);
		case 0xaa:
			return String.format("float:%s = %s %% %s;", vA, vB, vC);
			
		case 0xab:
			return String.format("double:%s,%s+1 = (%s,%s+1) + (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xac:
			return String.format("double:%s,%s+1 = (%s,%s+1) - (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xad:
			return String.format("double:%s,%s+1 = (%s,%s+1) * (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xae:
			return String.format("double:%s,%s+1 = (%s,%s+1) / (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		case 0xaf:
			return String.format("double:%s,%s+1 = (%s,%s+1) %% (%s,%s+1);", vA, vA, vB, vB, vC, vC);
		default:
			return null;
		}
	}
	
}
