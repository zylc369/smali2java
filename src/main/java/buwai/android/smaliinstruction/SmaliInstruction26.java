package buwai.android.smaliinstruction;

import java.util.ArrayList;
import java.util.List;

import buwai.android.smali2java.Utils;

/**
 * 

6e: invoke-virtual
6f: invoke-super
70: invoke-direct
71: invoke-static
72: invoke-interface

74: invoke-virtual/range
75: invoke-super/range
76: invoke-direct/range
77: invoke-static/range
78: invoke-interface/range	

 * @author buwai
 *
 */
public class SmaliInstruction26 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		List<String> regs = new ArrayList<String>();
		beginIndex = smaliInst.indexOf('{');
		endIndex = smaliInst.indexOf('}');
		
		if (id >= 0x74 && id <= 0x78) {
			// invoke-kind/range
			String vC = smaliInst.substring(beginIndex + 1, smaliInst.indexOf('.')).trim();
			String vN = smaliInst.substring(smaliInst.lastIndexOf('.') + 1, endIndex).trim();
			int vCI = Integer.parseInt(vC.substring(1));
			int vNI = Integer.parseInt(vN.substring(1));
			String regPrefix = vC.substring(0, 1);
			if (!regPrefix.equals(vN.substring(0, 1))) {
				System.err.println("[-] invoke-kind/range - 两个前缀不一样！！！");
			}
			for (int i = vCI; i <= vNI; i++) {
				regs.add(regPrefix + i);
			}
		} else {
			// invoke-kind
			for (int i = beginIndex + 1; i < endIndex; i++) {
				int index = smaliInst.indexOf(',', i);
				if (index >= endIndex) {
					regs.add(smaliInst.substring(i, index - 1).trim());
				} else {
					regs.add(smaliInst.substring(i, index).trim());
				}
				
				i = index + 1;
			}
		}
		
		beginIndex = endIndex + 2;
		endIndex = smaliInst.indexOf("->");
		String className = Utils.getJavaType(smaliInst.substring(beginIndex, endIndex).trim());
		
		beginIndex = endIndex + 2;
		endIndex = smaliInst.lastIndexOf('(');
		String methodName = smaliInst.substring(beginIndex, endIndex).trim();
		
		beginIndex = endIndex + 1;
		endIndex = smaliInst.lastIndexOf(')');
//		if ("invoke-direct {v2, v5, v6, v7, v8}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V".equals(smaliInst)) {
//			System.out.println("");
//		}
		List<String> types = Utils.getTypeList(smaliInst.substring(beginIndex, endIndex));
		
		String returnType = Utils.getJavaType(smaliInst.substring(endIndex + 1));
		
		StringBuilder sb = new StringBuilder();
		int regsLen = regs.size();
		int regIndex = 1;
		switch (id) {
		case 0x6e:	// invoke-virtual
		case 0x70:	// invoke-direct
		case 0x74:	// invoke-virtual/range
		case 0x76:	// invoke-direct/range
			sb.append(String.format("((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		case 0x6f:	// invoke-super
		case 0x75:	// invoke-super/range
			sb.append(String.format("super: ((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		case 0x71:
		case 0x77:	// invoke-static/range
			regIndex = 0;
			sb.append(String.format("%s->%s", className, methodName));
			break;
		case 0x72:	// invoke-interface
		case 0x78:	// invoke-interface/range
			sb.append(String.format("interface: ((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		default:
			return null;
		}
		
		if (0 == types.size()) {
			sb.append("()");
		} else {
			//System.out.println(smaliInst);
			sb.append("( ");
			for (int i = regIndex, j = 0; i < regsLen; i++, j++) {
				if (types.get(j).equals("double") || types.get(j).equals("long")) {
					sb.append(String.format("(%s)(%s, %s)", types.get(j), regs.get(i), regs.get(i + 1)));
					i++;
				} else {
					sb.append(String.format("(%s)%s", types.get(j), regs.get(i)));
				}
				if ((i + 1) != regsLen) {
					sb.append(", ");
				}
			}
			sb.append(" )");
		}
		
		sb.append(returnType);
		return sb.toString();
	}
	
}
