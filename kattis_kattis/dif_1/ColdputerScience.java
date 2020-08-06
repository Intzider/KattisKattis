package kattis_kattis.dif_1;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     count = 0,
                n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextInt() < 0)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}