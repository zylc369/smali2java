package buwai.android.smali2java;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	/**
	 * 将smali类型转换为Java的表示形式。
	 * 
	 * @param type
	 * @return
	 */
	public static String getJavaType(String smaliType) {
		char ch;
		ch = smaliType.charAt(0);
		String javaType;
		
		int index = 0;
		int dimensions = 0;
		
		if ('L' == ch) {
			return smaliType.substring(1, smaliType.lastIndexOf(';')).replace('/', '.');
		} else if ('[' == ch) {	// 处理数组的情况。
			for (char c : smaliType.toCharArray()) {
				if ('[' == c) {
					dimensions++;
					index++;
				} else {
					break;
				}
			}
		}
		
		ch = smaliType.charAt(index);
		if ('L' == ch) {
			javaType = smaliType.substring(index + 1, smaliType.lastIndexOf(';')).replace('/', '.');
		} else {
			switch (ch) {
			case 'V':
				javaType = "void";
				break;
			case 'Z':
				javaType = "boolean";
				break;
			case 'B':
				javaType = "byte";
				break;
			case 'S':
				javaType = "short";
				break;
			case 'C':
				javaType = "char";
				break;
			case 'I':
				javaType = "int";
				break;
			case 'J':
				javaType = "long";
				break;
			case 'F':
				javaType = "float";
				break;
			case 'D':
				javaType = "double";
				break;
			default:
				javaType = null;
				break;
			}
		}

		for (int i = 0; i < dimensions; i++) {
			javaType += "[]";
		}
		
		return javaType;
	}
	
	/**
	 * 数组类型的基础类型。
	 * 
	 * @param type
	 * @return
	 */
	public static String toArrayTypeSimple(String type) {
		int index = 0;
		for (char c : type.toCharArray()) {
			if ('[' == c) {
				index++;
			} else {
				break;
			}
		}

		String arrayType;
		char ch = type.charAt(index);
		if ('L' == ch) {
			arrayType = type.substring(index + 1, type.lastIndexOf(';')).replace('/', '.');
		} else {
			switch (ch) {
			case 'Z':
				arrayType = "boolean";
				break;
			case 'B':
				arrayType = "byte";
				break;
			case 'S':
				arrayType = "short";
				break;
			case 'C':
				arrayType = "char";
				break;
			case 'I':
				arrayType = "int";
				break;
			case 'J':
				arrayType = "long";
				break;
			case 'F':
				arrayType = "float";
				break;
			case 'D':
				arrayType = "double";
				break;
			default:
				arrayType = null;
				break;
			}
		}
		return arrayType;
	}
	
	/**
	 * 生成方法参数列表。
	 * 
	 * @param params
	 * @return 返回方法参数列表。
	 */
	public static List<String> getTypeList(String params) {
		List<String> types = new ArrayList<String>();
		int length = params.length();

		for (int i = 0; i < length; ) {
			String type;
			char ch = params.charAt(i);
			if ('L' == ch) {
				int end = params.indexOf(';', i) + 1;
				type = params.substring(i, end);
				i = end;
			} else if ('[' == ch) {
				int end;
				for (end = i + 1; end < length; end++) {
					char c = params.charAt(end);
					if ('[' == c) {
						continue;
					}
					if ('L' == c) {
						end = params.indexOf(';', end) + 1;
						break;
					}
					end += 1;
					break;
				}
				type = params.substring(i, end);
				i = end;
			} else {
				type = "" + ch;
				i++;
			}
			types.add(getJavaType(type));
		}
		return types;
	}

}
