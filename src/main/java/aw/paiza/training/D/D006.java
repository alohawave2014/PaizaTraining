package aw.paiza.training.D;

import java.util.Scanner;

/**
 * 距離 n とその単位 s がスペース区切りで与えられるので、すべての距離をmmに換算し出力してください。
 * @author aloha.wave
 */
public class D006 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        String tanni = scan.next();
        
        if ("km".equals(tanni)){
            len *= 1000000;
        } else if ("m".equals(tanni)){
            len *= 1000;
        } else if ("cm".equals(tanni)){
            len *= 10;
        } else {
            System.err.println("不正な単位");
        }
        
        System.out.println(String.valueOf(len));
        scan.close();
    }

}
