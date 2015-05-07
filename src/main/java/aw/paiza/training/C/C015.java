package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * ポイントカード計算
 * @author m.s
 *
 */
public class C015 {

	public static void main(String[] args) {

		C015Logic logic = new C015Logic();
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
	public static class C015Logic {

		// メインロジック
		public int execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			int receiptCnt = scan.nextInt();
			int point = 0;
			for (int i = 0; i < receiptCnt; i++) {
				String[] vals = scan.next().split("\\s");
				String days = vals[0];
				int amount = Integer.parseInt(vals[1]);

				// 3のつく日、５のつく日なので、部分一致検索が可読性がよさそう
				if (days.indexOf("3") >= 0) {
					point += Math.floor(amount * 0.03);
				} else if (days.indexOf("5") >= 0) {
					point += Math.floor(amount * 0.05);
				} else {
					point += Math.floor(amount * 0.01);
				}
				//				if ((days == 3) || (days == 13) || (days == 23) || (days == 30) || (days == 31)) {
				//					point += Math.floor(amount * 0.03);
				//				} else if ((days == 5) || (days == 15) || (days == 25)) {
				//					point += Math.floor(amount * 0.05);
				//				} else {
				//					point += Math.floor(amount * 0.01);
				//				}
			}

			System.out.println(String.valueOf(point));
			scan.close();

			return point;
		}
	}

}
