package kattis_kattis.dif_1;

import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(),
                min = in.nextInt(),
                junk,
                day = 0;
        for (int i = 1; i < n; i++) {
            junk = in.nextInt();
            if (junk < min) {
                day = i;
                min = junk;
            }
        }
        System.out.println(day);
        in.close();
    }
}