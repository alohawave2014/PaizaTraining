package aw.paiza.training.D;

import java.util.Scanner;

public class D013 {

    /**
     * 商と余り算出
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int result = M / N;
        int amari = M % N;
        System.out.println(String.valueOf(result) + " " + String.valueOf(amari));
        
        scan.close();
    }
}
