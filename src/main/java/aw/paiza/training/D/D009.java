package aw.paiza.training.D;

import java.util.Scanner;

/**
 * 西暦の計算
 * @author aloha.wave
 *
 */
public class D009 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int from = scan.nextInt();
        int to = scan.nextInt();
        int result = to - from;
        System.out.println(String.valueOf(result));
        
        scan.close();
    }

}
