package kattis_kattis.dif_1;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double  C = in.nextDouble(),
                L = in.nextDouble(),
                sqm = 0;
        for (int i = 0; i < L; i++)
            sqm += in.nextDouble()*in.nextDouble();
        System.out.println((double)sqm*C);
    }
}