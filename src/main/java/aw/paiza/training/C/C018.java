package aw.paiza.training.C;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C018 {

    /**
     * 魅力的な料理のレシピを手に入れたあなたは、早速調理を始めたいと思っています。 
     * レシピには、1人前を調理するのに必要な食材とその量が載っています。
     * このレシピと、あなたが所持している食材とその量が与えられるので、最大で何人前作れるかを求めてください。
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qty = 0;
        
        Map<String, Integer> resipi = new HashMap<String, Integer>();
        qty = scan.nextInt();
        resipi = createMap(scan, qty);
        
        Map<String, Integer> item = new HashMap<String, Integer>();
        qty = scan.nextInt();
        item = createMap(scan, qty);

        Integer min = Integer.MAX_VALUE;
        for (Entry<String, Integer> entity : resipi.entrySet()) {
            Integer resipiQty = entity.getValue();
            Integer itemQty= item.get(entity.getKey());
            if (itemQty == null){
                itemQty = 0;
            }
            
            Integer tmp = itemQty / resipiQty;
            if (min > tmp){
                min = tmp;
            }
        }
        
        System.out.println(String.valueOf(min));
        scan.close();
    }

    private static Map<String, Integer> createMap(Scanner scan, int ItemQty) {
        Map<String, Integer> result =  new HashMap<String, Integer>();
        for (int i = 0; i < ItemQty; i++) {
            String item = scan.next();
            Integer qty = scan.nextInt();
            result.put(item, qty);
        }
        return result;
    }

}
