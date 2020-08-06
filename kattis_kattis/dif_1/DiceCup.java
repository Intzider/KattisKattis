package kattis_kattis.dif_1;

import java.util.HashMap;
import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();

        HashMap<Integer, Integer> prob = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= d1; i++) {
            for (int j = 1; j <= d2 ; j++) {
                if(prob.containsKey(i+j)) {
                    prob.put(i+j, prob.get(i+j)+1);
                }else{
                    prob.put(i+j, 1);
                }
                if(prob.containsKey(i+j))
                    if(max < prob.get(i+j))
                        max = prob.get(i+j);
            }
        }
        for (int i = 2; i <= d1+d2; i++) {
            if(prob.get(i) == max)
                System.out.println(i);
        }
    }
}