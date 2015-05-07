package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Leet
 * @author m.s
 *
 */
public class C016 {

	public static void main(String[] args) {

		C016Logic logic = new C016Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 実行クラス
	 * @author m.s
	 */
	public static class C016Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			//scan.useDelimiter(System.getProperty("line.separator"));
			String val = scan.next();

			// replaceAll 版
			val = val.replaceAll("A", "4");
			val = val.replaceAll("E", "3");
			val = val.replaceAll("G", "6");
			val = val.replaceAll("I", "1");
			val = val.replaceAll("O", "0");
			val = val.replaceAll("S", "5");
			val = val.replaceAll("Z", "2");

			// switch版
			//			StringBuilder sb = new StringBuilder(val);
			//			for (int i = 0; i < val.length(); i++) {
			//				switch (val.charAt(i)) {
			//				case 'A':
			//					sb.setCharAt(i, '4');
			//					break;
			//				case 'E':
			//					sb.setCharAt(i, '3');
			//					break;
			//				case 'G':
			//					sb.setCharAt(i, '6');
			//					break;
			//				case 'I':
			//					sb.setCharAt(i, '1');
			//					break;
			//				case 'O':
			//					sb.setCharAt(i, '0');
			//					break;
			//				case 'S':
			//					sb.setCharAt(i, '5');
			//					break;
			//				case 'Z':
			//					sb.setCharAt(i, '2');
			//					break;
			//				default:
			//					break;
			//				}
			//			}
			//			val = sb.toString();
			System.out.println(val);
			scan.close();
		}
	}

}
