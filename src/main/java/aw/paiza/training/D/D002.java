package aw.paiza.training.D;

import java.util.Scanner;

/**
 * ある正の整数aとbがスペース区切りで入力されます。
 * aとbを比較し大きい方の値を出力して下さい。aとbが同じ場合は「eq」と出力して下さい。
 * @author aloha.wave
 */
public class D002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int na = scan.nextInt();
        int nb = scan.nextInt();
        
        String result = "eq";
        
        if (na>nb){
            result = String.valueOf(na);
        } else if (na<nb){
            result = String.valueOf(nb);
        }
        System.out.println(result);
        scan.close();        
    }

}
