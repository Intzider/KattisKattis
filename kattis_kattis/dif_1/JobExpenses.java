package kattis_kattis.dif_1;

import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(),
                sum = 0,
                exp;
        for (int i = 0; i < n; i++) {
            if ((exp = in.nextInt()) < 0)
                sum+=Math.abs(exp);
        }
        System.out.println(sum);
        in.close();
    }
}