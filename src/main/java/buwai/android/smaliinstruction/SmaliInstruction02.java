package buwai.android.smaliinstruction;

/**
 * 

返回指令
0e. return-void -> return;
0f. return vAA -> return vA;
10. return-wide vAA -> return vA,v(A+1);
11. return-object vAA -> return (Object)vA;

 * @author buwai
 *
 */
public class SmaliInstruction02 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex = smaliInst.lastIndexOf(' ');
		String vA = null;
		if (-1 != beginIndex) {
			beginIndex++;
			vA = smaliInst.substring(beginIndex);
		}
		switch (id) {
		case 0xe:
			return "return;";
		case 0xf:
			return "return " + vA + ";";
		case 0x10:
			return "return " + vA + "," + vA.substring(0, 1)  + "(" + vA.substring(1) + "+1);";
		case 0x11:
			return "return (Object)" + vA + ";";
		default:
			return null;
		}
	}
	
}
