package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 安息の地を求めて
 * 
 * @author aloha.wave
 *
 */
public class C010 {

	public static void main(String[] args) {
		C010Logic logic = new C010Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 実行クラス
	 * 
	 * @author m.s
	 */
	public static class C010Logic {

		private final String OK = "silent";
		private final String NG = "noisy";

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] line = scan.next().split("\\s");

			int pA = Integer.parseInt(line[0]);
			int pB = Integer.parseInt(line[1]);
			int pR = Integer.parseInt(line[2]);

			int placeCnt = scan.nextInt();

			for (int i = 0; i < placeCnt; i++) {
				line = scan.next().split("\\s");
				int pX = Integer.parseInt(line[0]);
				int pY = Integer.parseInt(line[1]);

				// (x-a)^2 + (y - b)^2 >= R^2 を満たすかチェック
				if ((Math.pow((pX - pA), 2) + Math.pow((pY - pB), 2)) >= Math.pow(pR, 2)) {
					System.out.println(OK);
				} else {
					System.out.println(NG);
				}
			}
			scan.close();
		}
	}

}
