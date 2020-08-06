package kattis_kattis.dif_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double tqol = 0;
        for (int i = 0; i < n; i++) {
            double qol = in.nextDouble();
            double years = in.nextDouble();
            tqol += qol*years;
        }
        NumberFormat frmt = new DecimalFormat("#0.000");
        System.out.println(frmt.format(tqol));
    }
}