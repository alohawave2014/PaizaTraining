package aw.paiza.training.B;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 手役の強さ
 * @author m.s
 *
 */
public class B017 {

	public static void main(String[] args) {
		B017Logic logic = new B017Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class B017Logic {

		private static final String FOUR = "FourCard";
		private static final String THREE = "ThreeCard";
		private static final String TWO = "TwoPair";
		private static final String ONE = "OnePair";
		private static final String NOPAIR = "NoPair";

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);

			String line = scan.next();
			char[] cards = line.toCharArray();

			Map<Character, Integer> map = new HashMap<Character, Integer>();

			for (int i = 0; i < cards.length; i++) {
				char card = cards[i];
				int cnt = 1;
				if (map.containsKey(card)) {
					cnt = map.get(card);
					++cnt;
				}
				map.put(cards[i], cnt);
			}

			//Optional<Integer> max = map.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

			int maxCharCnt = 0;
			for (Entry<Character, Integer> entity : map.entrySet()) {
				if (entity.getKey().equals('*')) {
					continue;
				}
				if (maxCharCnt < entity.getValue()) {
					maxCharCnt = entity.getValue();
				}
			}

			int result = 0;
			// * を反映			
			int wildCnt = (map.get('*') == null) ? 0 : map.get('*');
			// two pair
			if (wildCnt == 0) {
				if (map.keySet().size() == 2) {
					result = 2;
				} else {
					result = maxCharCnt;
					if (maxCharCnt <= 2) {
						--result;
					}
				}
			} else {
				switch (wildCnt) {
				case 1:
					if (maxCharCnt == 1) {
						result = 1;
					} else {
						result = maxCharCnt + 1;
					}
					break;
				case 2:
					if (maxCharCnt == 2) {
						result = 4;
					} else {
						result = 3;
					}
					break;
				case 3:
					result = 4;
					break;
				case 4:
					result = 4;
					break;
				default:
					break;
				}
			}

			String msg = NOPAIR;
			switch (result) {
			case 1:
				msg = ONE;
				break;
			case 2:
				msg = TWO;
				break;
			case 3:
				msg = THREE;
				break;
			case 4:
				msg = FOUR;
				break;
			default:
				break;
			}

			System.out.println(msg);

			scan.close();
		}
	}

}
