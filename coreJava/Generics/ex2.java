package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ex2 {
    public static void main(String[] args){
        Map<Integer,Double> map = new HashMap<>();
        Random rand = new Random();
        for(int i=0;i<10;i++){
            int key = rand.nextInt(100) + 1 ;
            double value = rand.nextDouble(100.00) + 1.00;
            map.put(key, value);
        }
        System.out.println(map);
    }
}
