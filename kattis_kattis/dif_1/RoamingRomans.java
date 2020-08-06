package kattis_kattis.dif_1;

import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double miles = in.nextDouble();
        miles = miles*1000*5280/4854;
        if (miles-(int)miles >= 0.5)
            System.out.println((int)Math.ceil(miles));
        else
            System.out.println((int)miles);
        in.close();
    }
}