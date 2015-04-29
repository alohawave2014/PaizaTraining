package aw.paiza.training.D;

import java.util.Scanner;

/**
 * Eメールアドレス
 * @author aloha.wave
 *
 */
public class D010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String local = scan.next();
        String domain = scan.next();
        StringBuffer sb = new StringBuffer()
        .append(local)
        .append("@")
        .append(domain);
     
        System.out.println(sb.toString());
        
        scan.close();
    }

}
