package aw.paiza.training.D;

import java.util.Scanner;

public class D007 {

    /**
     * 正の整数 N が標準入力から入力されるので、N 個の「*」を繋げた文字列を出力するプログラムを作成
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val; i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
        
        scan.close();
    }

}
