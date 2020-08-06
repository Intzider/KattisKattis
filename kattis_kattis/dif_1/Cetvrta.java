package kattis_kattis.dif_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> x = new LinkedList<>(), y = new LinkedList<>();
        int x1, y1;
        for (int i = 0; i < 3; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            if(x.isEmpty()){
                x.add(x1);
            }else{
                if(x.contains(x1))
                    x.remove(x.indexOf(x1));
                else
                    x.add(x1);
            }
            if(y.isEmpty()){
                y.add(y1);
            }else{
                if(y.contains(y1))
                    y.remove(y.indexOf(y1));
                else
                    y.add(y1);
            }
        }
        System.out.println(x.get(0)+" "+y.get(0));
    }
}