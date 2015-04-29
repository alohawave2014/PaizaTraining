package aw.paiza.training.D;

import java.util.Scanner;

public class D012 {

    /**
     * 絶対値を求めよ
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = Math.abs(scan.nextInt());
        System.out.println(String.valueOf(result));
        
        scan.close();
    }

}
