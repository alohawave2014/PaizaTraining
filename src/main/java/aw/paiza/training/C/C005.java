package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * アドレス調査
 * 
 * @author aloha.wave
 *
 */
public class C005 {

	public static void main(String[] args) {
		C005Logic logic = new C005Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class C005Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			// scan.useDelimiter(System.getProperty("line.separator"));

			int ipCnt = scan.nextInt();
			for (int i = 0; i < ipCnt; i++) {
				String line = scan.next();
				if (validate(line)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}

			scan.close();
		}

		private boolean validate(String line) {
			String[] val = line.split("\\.");
			if (val.length != 4) {
				return false;
			}

			for (int i = 0; i < val.length; i++) {
				try {
					Integer.parseInt(val[i]);
				} catch (NumberFormatException e) {
					return false;
				}
			}
			return true;
		}

	}

}
