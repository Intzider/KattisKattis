package kattis_kattis.dif_2;

import java.util.Scanner;

public class ThreeDPrintedStatues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int statues = in.nextInt();
        int printers = (int)Math.sqrt(statues);
        int days = 0;
        if ((int)Math.sqrt(printers)!=1)
            days = (int)Math.sqrt(printers);
        if (printers!=1)
            days += printers*2;
        System.out.println(days);
        in.close();
    }
}