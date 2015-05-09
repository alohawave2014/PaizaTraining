package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 嫌いな数字
 * 
 * @author aloha.wave
 *
 */
public class C013 {

	public static void main(String[] args) {

		C013Logic logic = new C013Logic();
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
	public static class C013Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			// scan.useDelimiter(System.getProperty("line.separator"));

			int hateNumber = scan.nextInt();
			int roomCnt = scan.nextInt();
			int favorateRoomCnt = 0;
			for (int i = 0; i < roomCnt; i++) {
				String line = scan.next();
				if (line.indexOf(String.valueOf(hateNumber)) == -1) {
					System.out.println(line);
					++favorateRoomCnt;
				}
			}

			if (favorateRoomCnt == 0) {
				System.out.println("none");
			}

			scan.close();
		}
	}

}
