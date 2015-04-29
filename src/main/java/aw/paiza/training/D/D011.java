package aw.paiza.training.D;

import java.util.Scanner;

/**
 * アルファベットで何番目
 * @author aloha.wave
 *
 */
public class D011 {

    private static final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String val = scan.next();
        int result = ALPHA.indexOf(val);    
        // indexOfは indexを返すためincrement
        System.out.println(String.valueOf(++result));
        
        scan.close();
    }

}
