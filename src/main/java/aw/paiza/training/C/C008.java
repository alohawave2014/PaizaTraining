package aw.paiza.training.C;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 文字列の抽出
 * 
 * @author aloha.wave
 *
 */
public class C008 {

	public static void main(String[] args) {
		C008Logic logic = new C008Logic();
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
	public static class C008Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] tags = scan.next().split("\\s");
			String tagFrom = tags[0];
			String tagTo = tags[1];

			String line = scan.next();
			while (true) {
				// start
				int idx = line.indexOf(tagFrom);
				if ((idx == -1)) {
					break;
				}
				line = line.substring(idx + tagFrom.length());

				// end
				idx = line.indexOf(tagTo);
				if ((idx == -1)) {
					break;
				}
				String result = line.substring(0, idx);
				if ("".equals(result)) {
					result = "<blank>";
				}
				System.out.println(result);

				// extract next string
				line = line.substring(idx);
			}
			scan.close();
		}
	}

}
