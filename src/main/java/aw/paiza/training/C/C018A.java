package aw.paiza.training.C;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * C018の改良版
 * @author m.s
 *
 */
public class C018A {

	public static void main(String[] args) {

		MyLogic logic = new MyLogic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// メインロジック
	public static class MyLogic {

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));
			int qty = 0;

			Map<String, Integer> resipi = new HashMap<String, Integer>();
			qty = scan.nextInt();
			resipi = createMap(scan, qty);

			Map<String, Integer> item = new HashMap<String, Integer>();
			qty = scan.nextInt();
			item = createMap(scan, qty);

			Integer min = Integer.MAX_VALUE;
			for (Entry<String, Integer> entity : resipi.entrySet()) {
				Integer recipeQty = entity.getValue();
				Integer itemQty = item.get(entity.getKey());
				if (itemQty == null) {
					itemQty = 0;
				}

				Integer tmp = itemQty / recipeQty;
				if (min > tmp) {
					min = tmp;
				}
			}

			System.out.println(String.valueOf(min));
			scan.close();
		}

		private Map<String, Integer> createMap(Scanner scan, int itemQty) {
			Map<String, Integer> result = new HashMap<String, Integer>();
			for (int i = 0; i < itemQty; i++) {
				String[] line = scan.next().split(" ");
				String item = line[0];
				Integer qty = Integer.parseInt(line[1]);
				result.put(item, qty);
			}
			return result;
		}
	}

}
