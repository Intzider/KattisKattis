package kattis_kattis.dif_1;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int I = in.nextInt();

        if (A == 1)
            System.out.println(I);
        else
            System.out.println(A*I - A+1);
    }
}