package aw.paiza.training.B;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ログファイルの抽出
 * 
 * @author aloha.wave
 *
 */
public class B004 {

	public static void main(String[] args) {
		B004Logic logic = new B004Logic();
		try {
			logic.execute(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class B004Logic {

		public void execute(InputStream input) {
			Scanner scan = new Scanner(input);
			scan.useDelimiter(System.getProperty("line.separator"));

			String searchIP = scan.next();
			int logLineCnt = scan.nextInt();
			for (int i = 0; i < logLineCnt; i++) {
				String[] lines = scan.next().split(" ");
				if (isMatch(searchIP, lines[0])) {
					String output = getOutput(lines);
					System.out.println(output);
				}
			}

			scan.close();
		}

		// // Stream(java1.8以上版)
		// private boolean isMatchByStream(String findIp, String ip) {
		// Pattern ptn = Pattern.compile("\\.");
		//
		// Stream<String> srcIpSm = ptn.splitAsStream(ip);
		// Stream<String> findIpSm = ptn.splitAsStream(findIp);
		// return true;
		// }

		private boolean isMatch(String searchIP, String ip) {
			String[] searchIPOct = searchIP.split("\\.");
			String[] ipOct = ip.split("\\.");

			// 1,2 オクテットはそのまま比較
			if (!ipOct[0].equals(searchIPOct[0]) || !ipOct[1].equals(searchIPOct[1])) {
				return false;
			}

			// 3,4 オクテットの比較
			if (!isMatchSub(searchIPOct[2], ipOct[2]) || !isMatchSub(searchIPOct[3], ipOct[3])) {
				return false;
			}

			return true;
		}

		// * > [] > 個別　の順で比較
		private boolean isMatchSub(String searchOct, String ipOct) {
			// * の場合
			if ("*".equals(searchOct)) {
				return true;
			}

			// []範囲指定の場合
			if (searchOct.indexOf("[") >= 0) {
				int ip = Integer.parseInt(ipOct);

				int beginIp = -1;
				int endIp = -1;

				// 部分文字列での取得
				// int sepIdx = searchOct.indexOf("-");
				// int beginIp = Integer.parseInt(searchOct.substring(1, sepIdx));
				// int endIp = Integer.parseInt(searchOct.substring(sepIdx + 1, searchOct.length() - 1));

				// 正規表現での取得
				Pattern ptn = Pattern.compile("\\[(\\d+)-(\\d+)\\]");
				Matcher mt = ptn.matcher(searchOct);
				if (mt.find()) {
					// String matchstr = mt.group();
					// System.out.println(matchstr + "の部分にマッチしました");
					// System.out.println("group1:" + mt.group(1));
					// System.out.println("group2:" + mt.group(2));
					beginIp = Integer.parseInt(mt.group(1));
					endIp = Integer.parseInt(mt.group(2));
				}
				return ((beginIp <= ip) && (endIp >= ip));
			}

			// 個別指定
			if (ipOct.equals(searchOct)) {
				return true;
			}

			return false;
		}

		private String getOutput(String[] lines) {
			StringBuilder sb = new StringBuilder() //
					.append(lines[0])
					.append(" ")
					.append(lines[3].substring(1))
					.append(" ")
					.append(lines[6]);

			return sb.toString();
		}
	}

}
