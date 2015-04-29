package aw.paiza.training.D;

import java.util.Scanner;

/**
 * 奇数か偶数か
 * @author aloha.wave
 *
 */
public class D008 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();        
        String result = "odd";
//        if ((val%2)==0){
        if ((val & 1)==0){
            result = "even";
        }        
        System.out.println(result);
        
        scan.close();    
   }

}
