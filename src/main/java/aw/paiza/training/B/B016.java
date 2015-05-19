package aw.paiza.training.B;

import java.io.InputStream;
import java.util.Scanner;

public class B016 {

	public static void main(String[] args) {
		B016Logic logic = new B016Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class B016Logic {

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] arg1 = scan.next().split(" ");
			String[] arg2 = scan.next().split(" ");

			int iW = Integer.parseInt(arg1[0]);
			int iH = Integer.parseInt(arg1[1]);
			int cnt = Integer.parseInt(arg1[2]);
			int iX = Integer.parseInt(arg2[0]);
			int iY = Integer.parseInt(arg2[1]);

			for (int i = 0; i < cnt; i++) {
				String[] line = scan.next().split(" ");
				String direction = line[0];
				Integer distance = Integer.parseInt(line[1]);

				if ("U".equals(direction)) {
					iY += distance;
				} else if ("D".equals(direction)) {
					iY -= distance;
				} else if ("R".equals(direction)) {
					iX += distance;
				} else if ("L".equals(direction)) {
					iX -= distance;
				}

				iX = (iX % iW);
				if (iX < 0) {
					iX += iW;
				}
				iY = (iY % iH);
				if (iY < 0) {
					iY += iH;
				}
			}
			System.out.printf("%s %s", iX, iY);
			scan.close();
		}

	}

}
