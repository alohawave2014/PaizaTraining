package aw.paiza.training.C;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 残り物の量
 * 
 * @author aloha.wave
 *
 */
public class C020 {

	public static void main(String[] args) {

		C020Logic logic = new C020Logic();
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
	public static class C020Logic {

		private final BigDecimal hundred = new BigDecimal(100);

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] line = scan.next().split("\\s");

			int total = Integer.parseInt(line[0]);
			int iP = Integer.parseInt(line[1]);
			int iQ = Integer.parseInt(line[2]);

			BigDecimal uriageZan = new BigDecimal(total).multiply(new BigDecimal(100 - iP)).divide(hundred);
			BigDecimal resultZan = uriageZan.multiply(new BigDecimal(100 - iQ)).divide(hundred);

			System.out.println(resultZan.toString());

			scan.close();
		}
	}

}
