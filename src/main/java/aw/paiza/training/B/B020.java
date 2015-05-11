package aw.paiza.training.B;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ネットサーフィン
 * 
 * @author aloha.wave
 *
 */
public class B020 {

	public static void main(String[] args) {
		B020Logic logic = new B020Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class B020Logic {

		private static final String BACK = "use the back button";
		private static final String GOPAGE = "go to (.+)";

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			int qryCnt = scan.nextInt();

			Pattern ptn = Pattern.compile(GOPAGE);
			Stack<String> history = new Stack<String>();
			//			scan.next();
			//			history.push("go to blank page");

			boolean isPrevOperationIsBack = false;
			for (int i = 0; i < qryCnt; i++) {
				String line = scan.next();
				if (line.equals(BACK)) {
					if (!isPrevOperationIsBack) {
						// 現在ページを一つ戻る
						history.pop();
						isPrevOperationIsBack = true;
					}
					System.out.println(history.pop());
				} else {
					isPrevOperationIsBack = false;
					Matcher mt = ptn.matcher(line);
					if (mt.find()) {
						// go some page
						history.push(mt.group(1));
						System.out.println(mt.group(1));
					}
				}
			}

			scan.close();
		}

	}

}
