package kattis_kattis.dif_1;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), next;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            next = in.nextInt();
            sum += (long)Math.pow(next/10, next%10);
        }
        System.out.println(sum);
        in.close();
    }
}