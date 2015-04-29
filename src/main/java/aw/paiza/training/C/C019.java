package aw.paiza.training.C;

//import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class C019 {

    /**
     * N を 2 以上の整数とし、N の約数のうち N 自身を除いたものの和を S とします。 このとき 
     * ・N = S となるような N を完全数 
     * ・|N-S| = 1 となるような N をほぼ完全数 
     * と言うことにしましょう。ここで、|N-S| は N-S の絶対値を意味します。 
     * たとえば、N = 28 のとき、28 の約数は 1, 2, 4, 7, 14, 28 なので、S = 1+2+4+7+14 = 28 となります。従って、28 は完全数です。
     * また、N = 16 のときには S = 1+2+4+8 = 15 となるので、16 はほぼ完全数です。
     * 
     * 入力された整数が完全数かほぼ完全数かそのいずれでもないかを判定するプログラムを作成してください。
     * 
     * @param args
     */
    public static void main(String[] args) {
        C019 logic = new C019();
        //logic.execByBufferReader(System.in);
        logic.execByScanner(System.in);
    }

    /**
     * BufferReaderを利用した場合
     * @param in
     */
//    private void execByBufferReader(InputStream in) {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
//        Integer qty = 0;
//        try {
//            qty = Integer.parseInt(bf.readLine());
//            for (int i = 0; i < qty; i++) {
//                validate(Integer.parseInt(bf.readLine()));                
//            }
//            bf.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            
//        }
//    }

    /**
     * @param in
     */
    private void execByScanner(InputStream in){
        Scanner scan = new Scanner(in);

        int cnt = scan.nextInt();
        for (int i = 0; i < cnt; i++) {
            validate(scan.nextInt());
        }
        scan.close();
    }
    
    /**
     * 所与
     * 2 ≦ val ≦ 1000 
     * @param val
     */
    private void validate(int val) {
        int sum = 1;
        
        for (int i = 2; i < val; i++) {
            if ((val % i) == 0){
                sum += i;
                // 
                if (sum>=(val+1)){
                    break;
                }
            }
        }
        
        if (val == sum){
            System.out.println("perfect");
        //} else if ((val == (sum-1)) || (val == (sum+1))){
        } else if (Math.abs(val-sum)==1){
            System.out.println("nearly");
        } else {
            System.out.println("neither");            
        }

    }

}
