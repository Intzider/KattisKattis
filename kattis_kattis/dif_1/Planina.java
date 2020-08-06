package kattis_kattis.dif_1;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), dots=2;
        in.close();

        for (int i = 0; i < n; i++) {
            dots = dots*2 - 1;
        }
        System.out.println((long)Math.pow(dots,2));
    }
}