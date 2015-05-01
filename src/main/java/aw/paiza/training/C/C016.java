package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

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
			scan.useDelimiter(System.getProperty("line.separator"));

			int parentNo1 = scan.nextInt();
			int parentNo2 = scan.nextInt();

			int childqty = scan.nextInt();

			for (int i = 0; i < childqty; i++) {
				int cNo1 = scan.nextInt();
				int cNo2 = scan.nextInt();

				if (parentNo1 > cNo1) {
					System.out.println("High");
				} else if (parentNo1 < cNo1) {
					System.out.println("Low");
				} else {
					if (parentNo2 > cNo2) {
						System.out.println("Low");
					} else if (parentNo2 < cNo2) {
						System.out.println("High");
					}
				}
			}
			scan.close();
		}
	}

}
