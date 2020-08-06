package kattis_kattis.dif_1;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     A = in.nextInt(),
                B = in.nextInt(),
                a = A%10, b = B%10;
        for (int i = 0; i < 2; i++) {
            A/=10; B/=10;
            a = 10*a + A%10;
            b = 10*b + B%10;
        }
        System.out.println(Math.max(a, b));
        in.close();
    }
}