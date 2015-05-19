package aw.paiza.training.A;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 最適な練習
 * @author m.s
 *
 */
public class A012 {

	public static void main(String[] args) {
		A012Logic logic = new A012Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class A012Logic {

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String arg1 = scan.next();

			System.out.printf("%s", arg1);
			scan.close();
		}

	}

}
