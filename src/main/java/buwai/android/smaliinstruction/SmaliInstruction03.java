package buwai.android.smaliinstruction;

/**
 * 

12. const/4 vA, #+B -> vA = <常量>;
13. const/16 vAA, #+BBBB -> vA = <常量>;
14. const vAA, #+BBBBBBBB -> vA = <常量>;
15. const/high16 vAA, #+BBBB0000 -> vA = <常量>;
16. const-wide/16 vAA, #+BBBB -> vA = <常量>;
17. const-wide/32 vAA, #+BBBBBBBB -> vA = <常量>;
18. const-wide vAA, #+BBBBBBBBBBBBBBBB -> vA = <常量>;
19. const-wide/high16 vAA, #+BBBB000000000000 -> vA = <常量>;
1a. const-string vAA, string@BBBB -> vA = <常量>;
1b. const-string/jumbo vAA, string@BBBBBBBB -> vA = <常量>;

 * @author buwai
 *
 */
public class SmaliInstruction03 {

	public static String toJava(int id, String smaliInst) {
		int beginIndex, endIndex;

		beginIndex = smaliInst.indexOf(' ');
		endIndex = smaliInst.indexOf(',', beginIndex + 1);
		String vA = smaliInst.substring(beginIndex, endIndex).trim();
		
		// endIndex + 1表示跳过逗号。
		String constValue = smaliInst.substring(endIndex + 1).trim();
		switch (id) {
		case 0x12:
		case 0x13:
		case 0x14:
			return vA + " = " + constValue + ";";
		case 0x15:
		case 0x16:
		case 0x17:
		case 0x18:
		case 0x19:
			return smaliInst;
		case 0x1a:
		case 0x1b:
			return vA + " = " + constValue + ";";
		default:
			return null;
		}
	}

}
