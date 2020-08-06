package kattis_kattis.dif_1;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(),
                w = in.nextInt(),
                h = in.nextInt();
        double c = Math.sqrt(Math.pow(w,2)+Math.pow(h,2));
        for (int i = 0; i < n; i++) {
            if(in.nextInt()<=c)
                System.out.println("DA");
            else
                System.out.println("NE");
        }
        in.close();
    }
}