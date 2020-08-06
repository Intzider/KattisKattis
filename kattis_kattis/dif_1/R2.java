package kattis_kattis.dif_1;

import java.util.Scanner;

public class R2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int mean = in.nextInt();
        System.out.println(mean*2-r1);
    }
}