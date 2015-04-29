package aw.paiza.training.D;

import java.util.Scanner;

public class D003 {

    /**
     * 正の整数1から9に整数nをそれぞれを掛けた数を半角スペース区切りで出力して下さい。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();        
        sb.append(String.valueOf(N*1));
        
        for (int i = 2; i <= 9; i++) {
            sb.append(" ");
            sb.append(String.valueOf(N*i));
        }
        
        System.out.println(String.valueOf(sb.toString()));
        scan.close();        
    }

}
