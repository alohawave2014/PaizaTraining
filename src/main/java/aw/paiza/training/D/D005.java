package aw.paiza.training.D;

import java.util.Scanner;

public class D005 {

    /**
     * 初項 m が与えられ、公差 n が与えられるので 10番目までの数字をスペース区切りで出力するプログラムを作成してください。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ival = scan.nextInt();
        int iKousa = scan.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ival));
        
        for (int i = 1; i < 10; i++) {
            ival += iKousa;
            sb.append(" ");
            sb.append(String.valueOf(ival));
            
        }
        
        System.out.println(String.valueOf(sb.toString()));
        scan.close();        
    }

}
