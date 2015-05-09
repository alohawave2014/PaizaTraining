package aw.paiza.training.C;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * ハイスコアランキング
 * 
 * @author aloha.wave
 *
 */
public class C006 {

	public static void main(String[] args) {
		C006Logic logic = new C006Logic();
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
	public static class C006Logic {

		// メインロジック
		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String[] line = scan.next().split("\\s");
			int paramCnt = Integer.parseInt(line[0]); // parameter count
			int userCnt = Integer.parseInt(line[1]); // user count
			int topK = Integer.parseInt(line[2]); // top K

			line = scan.next().split("\\s");
			// list, map の両方で練習
			List<Long> mList = new ArrayList<Long>();
			Map<Integer, Long> mMap = new HashMap<Integer, Long>();

			for (int i = 0; i < userCnt; i++) {
				String[] mline = scan.next().split("\\s");
				Double total = 0D;
				for (int j = 0; j < paramCnt; j++) {
					Double keisu = Double.parseDouble(line[j]);
					int val = Integer.parseInt(mline[j]);
					total += val * keisu;
				}
				// 小数第1位 round
				Long iTotal = Math.round(total);
				mList.add(iTotal);
				mMap.put(i, iTotal);
			}

			// List 降順
			System.out.println("--List Edition");
			// mList = getSotedByValue(mList);
			// lambda
			mList.stream().sorted((s1, s2) -> s2.compareTo(s1)).limit(topK).forEach(System.out::println);

			// mapソート
			System.out.println("--Map Edition");
			// lambda
			List<Map.Entry<Integer, Long>> entries = new ArrayList<Map.Entry<Integer, Long>>(mMap.entrySet());
			entries.stream()
					.sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
					.limit(topK)
					.forEach(s -> System.out.println(s.getValue()));

			scan.close();
		}

		/**
		 * Mapを　Valueの降順でソート
		 * 
		 * @param mMap
		 * @return
		 */
		private List<Map.Entry<Integer, Long>> getSortedMapEntries(Map<Integer, Long> mMap) {
			List<Map.Entry<Integer, Long>> entries = new ArrayList<Map.Entry<Integer, Long>>(mMap.entrySet());
			entries.sort(new Comparator<Map.Entry<Integer, Long>>() {
				@Override
				public int compare(Entry<Integer, Long> o1, Entry<Integer, Long> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			return entries;
		}

		/**
		 * Listソート
		 * 
		 * @param list
		 * @return
		 */
		private List<Long> getSotedByValue(List<Long> list) {
			list.sort(new Comparator<Long>() {
				@Override
				public int compare(Long o1, Long o2) {
					return o2.compareTo(o1);
				}
			});
			return list;
		}

	}
}
