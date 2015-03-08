package buwai.android.smaliinstruction;

/**
 * 

d0: add-int/lit16
d1: rsub-int (reverse subtract)
d2: mul-int/lit16
d3: div-int/lit16
d4: rem-int/lit16
d5: and-int/lit16
d6: or-int/lit16
d7: xor-int/lit16

d8: add-int/lit8
d9: rsub-int/lit8
da: mul-int/lit8
db: div-int/lit8
dc: rem-int/lit8
dd: and-int/lit8
de: or-int/lit8
df: xor-int/lit8
e0: shl-int/lit8
e1: shr-int/lit8
e2: ushr-int/lit8

 * @author buwai
 *
 */
public class SmaliInstruction31 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',');
		
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		beginIndex = endIndex + 1;
		endIndex = smaliInst.indexOf(',', beginIndex);
		String vB = smaliInst.substring(beginIndex, endIndex).trim();
		String lit = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0xd0:	// add-int/lit16
		case 0xd8:	// add-int/lit8
			return String.format("int:%s = %s + %s;", vA, vB, lit);
		case 0xd1:	// rsub-int (reverse subtract)
		case 0xd9:	// rsub-int/lit8
			return smaliInst;
		case 0xd2:	// mul-int/lit16
		case 0xda:	// mul-int/lit8
			return String.format("int:%s = %s * %s;", vA, vB, lit);
		case 0xd3:	// div-int/lit16
		case 0xdb:	// div-int/lit8
			return String.format("int:%s = %s / %s;", vA, vB, lit);
		case 0xd4:	// rem-int/lit16
		case 0xdc:	// rem-int/lit8
			return String.format("int:%s = %s %% %s;", vA, vB, lit);
		case 0xd5:	// and-int/lit16
		case 0xdd:	// and-int/lit8
			return String.format("int:%s = %s & %s;", vA, vB, lit);
		case 0xd6:	// or-int/lit16
		case 0xde:	// or-int/lit8
			return String.format("int:%s = %s | %s;", vA, vB, lit);
		case 0xd7:	// xor-int/lit16
		case 0xdf:	// xor-int/lit8
			return String.format("int:%s = %s ^ %s;", vA, vB, lit);

		case 0xe0:	// shl-int/lit8
			return String.format("int:%s = %s << %s;", vA, vB, lit);
		case 0xe1:	// shr-int/lit8
			return String.format("int:%s = %s >> %s;", vA, vB, lit);
		case 0xe2:	// ushr-int/lit8
			return String.format("int:%s = %s >>> %s;", vA, vB, lit);
		default:
			return null;
		}
	}
	
}
