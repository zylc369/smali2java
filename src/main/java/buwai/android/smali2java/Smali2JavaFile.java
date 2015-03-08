package buwai.android.smali2java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import buwai.android.smaliinstruction.SmaliInstruction;
import buwai.android.smaliinstruction.SmaliInstruction01;
import buwai.android.smaliinstruction.SmaliInstruction02;
import buwai.android.smaliinstruction.SmaliInstruction03;
import buwai.android.smaliinstruction.SmaliInstruction04;
import buwai.android.smaliinstruction.SmaliInstruction05;
import buwai.android.smaliinstruction.SmaliInstruction06;
import buwai.android.smaliinstruction.SmaliInstruction07;
import buwai.android.smaliinstruction.SmaliInstruction08;
import buwai.android.smaliinstruction.SmaliInstruction09;
import buwai.android.smaliinstruction.SmaliInstruction10;
import buwai.android.smaliinstruction.SmaliInstruction11;
import buwai.android.smaliinstruction.SmaliInstruction12;
import buwai.android.smaliinstruction.SmaliInstruction13;
import buwai.android.smaliinstruction.SmaliInstruction14;
import buwai.android.smaliinstruction.SmaliInstruction15;
import buwai.android.smaliinstruction.SmaliInstruction16;
import buwai.android.smaliinstruction.SmaliInstruction17;
import buwai.android.smaliinstruction.SmaliInstruction18;
import buwai.android.smaliinstruction.SmaliInstruction19;
import buwai.android.smaliinstruction.SmaliInstruction20;
import buwai.android.smaliinstruction.SmaliInstruction21;
import buwai.android.smaliinstruction.SmaliInstruction22;
import buwai.android.smaliinstruction.SmaliInstruction23;
import buwai.android.smaliinstruction.SmaliInstruction24;
import buwai.android.smaliinstruction.SmaliInstruction25;
import buwai.android.smaliinstruction.SmaliInstruction26;
import buwai.android.smaliinstruction.SmaliInstruction27;
import buwai.android.smaliinstruction.SmaliInstruction28;
import buwai.android.smaliinstruction.SmaliInstruction29;
import buwai.android.smaliinstruction.SmaliInstruction30;
import buwai.android.smaliinstruction.SmaliInstruction31;

public class Smali2JavaFile {

	private File mSmaliFile;

	public Smali2JavaFile(File file) {
		mSmaliFile = file;
	}

	public void toJava(File out) {
		BufferedReader reader = null;
		BufferedWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(mSmaliFile));
			writer = new BufferedWriter(new FileWriter(out));

			String line;
			//List<String> lines = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				writer.write(smali2Java(line));
				writer.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != writer) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private String smali2Java(String line) {
		if (0 == line.length()) {
			return line;
		}
		
		String trimLine = line.trim();
		int index;
		if ((index = trimLine.indexOf(' ')) == -1) {
			return line;
		} else if ('.' == trimLine.charAt(0)) {
			return line;
		} else if ('#' == trimLine.charAt(0)) {
			return line;
		} else {
			String smaliFeature = trimLine.substring(0, index);
			SmaliInstruction smaliInst = SmaliInstruction.smaliInstructions.get(smaliFeature);
			if (null == smaliInst) {
				return line;
			}
			
			int id = smaliInst.id;
			
			String newLine = null;
			switch (id) {
			case 0x1:
			case 0x2:
			case 0x3:
			case 0x4:
			case 0x5:
			case 0x6:
			case 0x7:
			case 0x8:
			case 0x9:
				newLine = SmaliInstruction01.toJava(id, trimLine);
				break;
			case 0xe:
			case 0xf:
			case 0x10:
			case 0x11:
				newLine = SmaliInstruction02.toJava(id, trimLine);
				break;
			case 0x12:
			case 0x13:
			case 0x14:
			case 0x15:
			case 0x16:
			case 0x17:
			case 0x18:
			case 0x19:
			case 0x1a:
			case 0x1b:
				newLine = SmaliInstruction03.toJava(id, trimLine);
				break;
			case 0x1c:
				newLine = SmaliInstruction04.toJava(id, trimLine);
				break;
			case 0x1d:
				newLine = SmaliInstruction05.toJava(id, trimLine);
				break;
			case 0x1e:
				newLine = SmaliInstruction06.toJava(id, trimLine);
				break;
			case 0x1f:
				newLine = SmaliInstruction07.toJava(id, trimLine);
				break;
			case 0x20:
				newLine = SmaliInstruction08.toJava(id, trimLine);
				break;
			case 0x21:
				newLine = SmaliInstruction09.toJava(id, trimLine);
				break;
			case 0x22:
				newLine = SmaliInstruction10.toJava(id, trimLine);
				break;
			case 0x23:
				newLine = SmaliInstruction11.toJava(id, trimLine);
				break;
			case 0x24:
			case 0x25:
			case 0x26:
				newLine = SmaliInstruction12.toJava(id, trimLine);
				break;
			case 0x27:
				newLine = SmaliInstruction13.toJava(id, trimLine);
				break;
			case 0x28:
			case 0x29:
			case 0x2a:
				newLine = SmaliInstruction14.toJava(id, trimLine);
				break;
			case 0x2b:
				newLine = SmaliInstruction15.toJava(id, trimLine);
				break;
			case 0x2c:
				newLine = SmaliInstruction16.toJava(id, trimLine);
				break;
			case 0x2d:
			case 0x2e:
			case 0x2f:
			case 0x30:
			case 0x31:
				newLine = SmaliInstruction17.toJava(id, trimLine);
				break;
			case 0x32:
			case 0x33:
			case 0x34:
			case 0x35:
			case 0x36:
			case 0x37:
				newLine = SmaliInstruction18.toJava(id, trimLine);
				break;
			case 0x38:
			case 0x39:
			case 0x3a:
			case 0x3b:
			case 0x3c:
			case 0x3d:
				newLine = SmaliInstruction19.toJava(id, trimLine);
				break;
			case 0x44:
			case 0x45:
			case 0x46:
			case 0x47:
			case 0x48:
			case 0x49:
			case 0x4a:
				newLine = SmaliInstruction20.toJava(id, trimLine);
				break;
			case 0x4b:
			case 0x4c:
			case 0x4d:
			case 0x4e:
			case 0x4f:
			case 0x50:
			case 0x51:
				newLine = SmaliInstruction21.toJava(id, trimLine);
				break;
			case 0x52:
			case 0x53:
			case 0x54:
			case 0x55:
			case 0x56:
			case 0x57:
			case 0x58:
				newLine = SmaliInstruction22.toJava(id, trimLine);
				break;
			case 0x59:
			case 0x5a:
			case 0x5b:
			case 0x5c:
			case 0x5d:
			case 0x5e:
			case 0x5f:
				newLine = SmaliInstruction23.toJava(id, trimLine);
				break;
			case 0x60:
			case 0x61:
			case 0x62:
			case 0x63:
			case 0x64:
			case 0x65:
			case 0x66:
				newLine = SmaliInstruction24.toJava(id, trimLine);
				break;
			case 0x67:
			case 0x68:
			case 0x69:
			case 0x6a:
			case 0x6b:
			case 0x6c:
			case 0x6d:
				newLine = SmaliInstruction25.toJava(id, trimLine);
				break;
			case 0x6e:
			case 0x6f:
			case 0x70:
			case 0x71:
			case 0x72:
			case 0x74:
			case 0x75:
			case 0x76:
			case 0x77:
			case 0x78:
				newLine = SmaliInstruction26.toJava(id, trimLine);
				break;
			case 0x7b:
			case 0x7c:
			case 0x7d:
			case 0x7e:
			case 0x7f:
			case 0x80:
				newLine = SmaliInstruction27.toJava(id, trimLine);
				break;
			case 0x81:
			case 0x82:
			case 0x83:
			case 0x84:
			case 0x85:
			case 0x86:
			case 0x87:
			case 0x88:
			case 0x89:
			case 0x8a:
			case 0x8b:
			case 0x8c:
			case 0x8d:
			case 0x8e:
			case 0x8f:
				newLine = SmaliInstruction28.toJava(id, trimLine);
				break;
			case 0x90:
			case 0x91:
			case 0x92:
			case 0x93:
			case 0x94:
			case 0x95:
			case 0x96:
			case 0x97:
			case 0x98:
			case 0x99:
			case 0x9a:
			case 0x9b:
			case 0x9c:
			case 0x9d:
			case 0x9e:
			case 0x9f:
			case 0xa0:
			case 0xa1:
			case 0xa2:
			case 0xa3:
			case 0xa4:
			case 0xa5:
			case 0xa6:
			case 0xa7:
			case 0xa8:
			case 0xa9:
			case 0xaa:
			case 0xab:
			case 0xac:
			case 0xad:
			case 0xae:
			case 0xaf:
				newLine = SmaliInstruction29.toJava(id, trimLine);
				break;
			case 0xb0:
			case 0xb1:
			case 0xb2:
			case 0xb3:
			case 0xb4:
			case 0xb5:
			case 0xb6:
			case 0xb7:
			case 0xb8:
			case 0xb9:
			case 0xba:
			case 0xbb:
			case 0xbc:
			case 0xbd:
			case 0xbe:
			case 0xbf:
			case 0xc0:
			case 0xc1:
			case 0xc2:
			case 0xc3:
			case 0xc4:
			case 0xc5:
			case 0xc6:
			case 0xc7:
			case 0xc8:
			case 0xc9:
			case 0xca:
			case 0xcb:
			case 0xcc:
			case 0xcd:
			case 0xce:
			case 0xcf:
				newLine = SmaliInstruction30.toJava(id, trimLine);
				break;
			case 0xd0:
			case 0xd1:
			case 0xd2:
			case 0xd3:
			case 0xd4:
			case 0xd5:
			case 0xd6:
			case 0xd7:

			case 0xd8:
			case 0xd9:
			case 0xda:
			case 0xdb:
			case 0xdc:
			case 0xdd:
			case 0xde:
			case 0xdf:
			case 0xe0:
			case 0xe1:
			case 0xe2:
				newLine = SmaliInstruction31.toJava(id, trimLine);
				break;
			default:
				return line;
			}
			return "    " + newLine;
		}
	}

}
