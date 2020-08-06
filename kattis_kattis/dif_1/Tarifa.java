package kattis_kattis.dif_1;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int n = in.nextInt();
        int total = X;
        for (int i = 0; i < n; i++) {
            int thisMonth = X-in.nextInt();
            if (total+thisMonth>=0)
                total+=thisMonth;
        }
        System.out.println(total);
    }
}