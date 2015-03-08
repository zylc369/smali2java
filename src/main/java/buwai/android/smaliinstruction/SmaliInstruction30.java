package buwai.android.smaliinstruction;

/**
 * 

b0: add-int/2addr
b1: sub-int/2addr
b2: mul-int/2addr
b3: div-int/2addr
b4: rem-int/2addr
b5: and-int/2addr
b6: or-int/2addr
b7: xor-int/2addr
b8: shl-int/2addr
b9: shr-int/2addr
ba: ushr-int/2addr
bb: add-long/2addr
bc: sub-long/2addr
bd: mul-long/2addr
be: div-long/2addr
bf: rem-long/2addr
c0: and-long/2addr
c1: or-long/2addr
c2: xor-long/2addr
c3: shl-long/2addr
c4: shr-long/2addr
c5: ushr-long/2addr
c6: add-float/2addr
c7: sub-float/2addr
c8: mul-float/2addr
c9: div-float/2addr
ca: rem-float/2addr
cb: add-double/2addr
cc: sub-double/2addr
cd: mul-double/2addr
ce: div-double/2addr
cf: rem-double/2addr

 * @author buwai
 *
 */
public class SmaliInstruction30 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',');
		
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		String vB = smaliInst.substring(endIndex + 1).trim();
		
		switch (id) {
		case 0xb0:
			return String.format("int:%s += %s;", vA, vB);
		case 0xb1:
			return String.format("int:%s -= %s;", vA, vB);
		case 0xb2:
			return String.format("int:%s *= %s;", vA, vB);
		case 0xb3:
			return String.format("int:%s /= %s;", vA, vB);
		case 0xb4:
			return String.format("int:%s %%= %s;", vA, vB);
		case 0xb5:
			return String.format("int:%s &= %s;", vA, vB);
		case 0xb6:
			return String.format("int:%s |= %s;", vA, vB);
		case 0xb7:
			return String.format("int:%s ^= %s;", vA, vB);
		case 0xb8:
			return String.format("int:%s <<= %s;", vA, vB);
		case 0xb9:
			return String.format("int:%s >>= %s;", vA, vB);
		case 0xba:
			return String.format("int:%s >>>= %s;", vA, vB);
			
		case 0xbb:
			return String.format("long:%s,%s+1 += %s,%s+1;", vA, vA, vB, vB);
		case 0xbc:
			return String.format("long:%s,%s+1 -= %s,%s+1;", vA, vA, vB, vB);
		case 0xbd:
			return String.format("long:%s,%s+1 *= %s,%s+1;", vA, vA, vB, vB);
		case 0xbe:
			return String.format("long:%s,%s+1 /= %s,%s+1;", vA, vA, vB, vB);
		case 0xbf:
			return String.format("long:%s,%s+1 %%= %s,%s+1;", vA, vA, vB, vB);
		case 0xc0:
			return String.format("long:%s,%s+1 &= %s,%s+1;", vA, vA, vB, vB);
		case 0xc1:
			return String.format("long:%s,%s+1 |= %s,%s+1;", vA, vA, vB, vB);
		case 0xc2:
			return String.format("long:%s,%s+1 ^= %s,%s+1;", vA, vA, vB, vB);
		case 0xc3:
			return String.format("long:%s,%s+1 <<= %s,%s+1;", vA, vA, vB, vB);
		case 0xc4:
			return String.format("long:%s,%s+1 >>= %s,%s+1;", vA, vA, vB, vB);
		case 0xc5:
			return String.format("long:%s,%s+1 >>>= %s,%s+1;", vA, vA, vB, vB);
			
		case 0xc6:
			return String.format("float:%s += %s;", vA, vB);
		case 0xc7:
			return String.format("float:%s -= %s;", vA, vB);
		case 0xc8:
			return String.format("float:%s *= %s;", vA, vB);
		case 0xc9:
			return String.format("float:%s /= %s;", vA, vB);
		case 0xca:
			return String.format("float:%s %%= %s;", vA, vB);
			
		case 0xcb:
			return String.format("double:%s,%s+1 += %s,%s+1;", vA, vA, vB, vB);
		case 0xcc:
			return String.format("double:%s,%s+1 -= %s,%s+1;", vA, vA, vB, vB);
		case 0xcd:
			return String.format("double:%s,%s+1 *= %s,%s+1;", vA, vA, vB, vB);
		case 0xce:
			return String.format("double:%s,%s+1 /= %s,%s+1;", vA, vA, vB, vB);
		case 0xcf:
			return String.format("double:%s,%s+1 %%= %s,%s+1;", vA, vA, vB, vB);
		default:
			return null;
		}
	}
	
}
