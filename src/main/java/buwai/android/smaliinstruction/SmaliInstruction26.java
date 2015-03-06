package buwai.android.smaliinstruction;

import java.util.ArrayList;
import java.util.List;

import buwai.android.smali2java.Utils;

public class SmaliInstruction26 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;
		List<String> regs = new ArrayList<String>();
		beginIndex = smaliInst.indexOf('{');
		endIndex = smaliInst.indexOf('}');
		
		for (int i = beginIndex + 1; i < endIndex; i++) {
			int index = smaliInst.indexOf(',', i);
			if (index >= endIndex) {
				regs.add(smaliInst.substring(i, index - 1).trim());
			} else {
				regs.add(smaliInst.substring(i, index).trim());
			}
			
			i = index + 1;
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
		switch (id) {
		case 0x6e:
			sb.append(String.format("((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		case 0x6f:
			sb.append(String.format("super: ((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		case 0x70:
			sb.append(String.format("((%s)%s)->%s", className, regs.get(0), methodName));
			break;
		case 0x71:
			return smaliInst;
		case 0x72:
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
			for (int i = 1, j = 0; i < regsLen; i++, j++) {
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
