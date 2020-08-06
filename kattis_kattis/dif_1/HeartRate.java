package kattis_kattis.dif_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), b;
        double p, hr, diff;
        DecimalFormat format = new DecimalFormat("#.0000");
        for (int i = 0; i < n; i++) {
            b = in.nextInt();
            p = in.nextDouble();
            hr = 60*b/p;
            diff = hr/b;
            System.out.println(format.format(hr-diff) + " " + format.format(hr) + " " + format.format(hr+diff));
        }
    }
}