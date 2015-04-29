package aw.paiza.training.D;

import java.util.Scanner;

/**
 * 半角アルファベットのみで構成された長さmの文字列s_iがn行入力されます。
 * @author aloha.wave
 */
public class D004 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        
        int cnt = scan.nextInt();
        for (int i = 1; i <= cnt; i++) {
            String si = scan.next();
            sb.append(si);
            if (i!=cnt){
                sb.append(",");    
            } else {
                sb.append(".");        
            }
        }
        
        System.out.println(String.valueOf(sb.toString()));
        scan.close();        
    }

}
