package kattis_kattis.dif_1;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = in.nextInt(), n = 0, slugg = 0, m;
        for (int i = 0; i < j; i++) {
            if((m = in.nextInt()) != -1){
                slugg+=m;
                n++;
            }
        }
        System.out.println((double) slugg/n);
    }
}