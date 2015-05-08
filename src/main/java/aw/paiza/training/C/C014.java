package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * ボールが入る箱
 * @author m.s
 *
 */
public class C014 {

	public static void main(String[] args) {

		C014Logic logic = new C014Logic();
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
	public static class C014Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] firstArgs = scan.next().split("\\s");
			int boxCnt = Integer.parseInt(firstArgs[0]);
			int ballLen = Integer.parseInt(firstArgs[1]) * 2;

			for (int i = 0; i < boxCnt; i++) {
				String[] line = scan.next().split("\\s");
				int iH = Integer.parseInt(line[0]);
				int iW = Integer.parseInt(line[1]);
				int iD = Integer.parseInt(line[2]);

				if ((iH >= ballLen) && (iW >= ballLen) && (iD >= ballLen)) {
					System.out.println(String.valueOf(i + 1));
				}
			}

			scan.close();
		}
	}

}
