package aw.paiza.training.B;

import java.io.InputStream;
import java.util.Scanner;

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

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			// scan.useDelimiter(System.getProperty("line.separator"));

			int ipCnt = scan.nextInt();
			System.out.println(String.valueOf(ipCnt));

			scan.close();
		}

	}

}
