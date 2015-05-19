package aw.paiza.training.B;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

/**
 * 手役の強さ
 * 
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

		private static enum ANSWER {
			FourCard, ThreeCard, TwoPair, OnePair, NoPair;
		}

		// for junit
		public void sample1() {
			List<String> list = Arrays.asList("b", "a", "d", "c");

			// Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
			// Optional<String> m = list.stream().max(Comparator.comparing(s->s.toString());
			Optional<String> m = list.stream().max(Comparator.naturalOrder());
			System.out.println(m);
		}

		// for junit
		public void sample2(String input) {
			// String -> map<文字, 出現回数> に変換
			Map<Character, Integer> map = toMap(input);
			int maxCnt = getMaxCharctorCount(map);
			System.out.println(maxCnt);
			System.out.println(ANSWER.NoPair);
		}

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);

			String line = scan.next();
			// String -> map<文字, 出現回数> に変換
			Map<Character, Integer> map = toMap(line);
			// 出現回数が最大の数値を取得 (ただし、key='*' のentityは除く)
			int maxCharCnt = getMaxCharctorCount(map);

			ANSWER result = ANSWER.NoPair;
			// * を反映
			int wildCnt = (map.get('*') == null) ? 0 : map.get('*');
			// TODO この判定をもっと簡潔に
			if (wildCnt == 0) {
				if ((map.keySet().size() == 2) && (maxCharCnt == 2)) {
					result = ANSWER.TwoPair;
				} else {
					if (maxCharCnt == 2) {
						result = ANSWER.OnePair;
					} else if (maxCharCnt == 3) {
						result = ANSWER.ThreeCard;
					} else if (maxCharCnt == 4) {
						result = ANSWER.FourCard;
					}
				}
			} else {
				switch (wildCnt) {
				case 1:
					if (maxCharCnt == 1) {
						result = ANSWER.OnePair;
					} else if (maxCharCnt == 2) {
						result = ANSWER.ThreeCard;
					} else {
						result = ANSWER.FourCard;
					}
					break;
				case 2:
					if (maxCharCnt == 2) {
						result = ANSWER.FourCard;
					} else {
						result = ANSWER.ThreeCard;
					}
					break;
				case 3:
				case 4:
					result = ANSWER.FourCard;
					break;
				default:
					break;
				}
			}
			System.out.println(result);

			scan.close();
		}

		// TODO streamで記述できないかな？
		private Map<Character, Integer> toMap(String line) {
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
			return map;
		}

		private int getMaxCharctorCount(Map<Character, Integer> map) {
			// 出現回数が最大の数値を取得 (ただし、key='*' のentityは除く)
			Optional<Integer> m = map
					.entrySet()
					.stream()
					.filter(e -> !e.getKey().equals('*'))
					.map(e -> e.getValue())
					.max(Comparator.naturalOrder());
			int maxCnt = m.orElse(1);
			return maxCnt;
		}
	}

	public static class B017Resolver {

	}

}
