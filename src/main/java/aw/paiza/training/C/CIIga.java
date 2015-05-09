package aw.paiza.training.C;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 標準入力された英文を、単語毎にカウントして標準出力
 * 
 * @author aloha.wave
 *
 */
public class CIIga {

	public static void main(String[] args) {
		CIIgaLogic logic = new CIIgaLogic();
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
	public static class CIIgaLogic {

		// メインロジック
		public void execute(InputStream input) {

			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			Stream<String> words = br.lines().flatMap(line -> Stream.of(line.split("[\\s,\\.]+")));

			List<Item> items = words.collect(Collectors.groupingBy(String::toString)) // Map<String, List<String>)で集約
					.entrySet()
					.stream()
					// Stream<Item> に変換
					.map(entry -> new Item(entry.getKey(), entry.getValue().size()))
					.sorted((e1, e2) -> e1.word.compareTo(e2.word))
					// .forEach(item -> System.out.println(item.toString())); //直接 標準出力する場合
					.collect(Collectors.toList());

			items.forEach(System.out::println);
		}

		// Map変換用クラス
		private class Item {
			public String word;
			public int count;

			public Item(String word, int count) {
				this.word = word;
				this.count = count;
			}

			public String toString() {
				return this.word + " : " + String.valueOf(this.count);
			}
		}
	}

}
