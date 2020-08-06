package kattis_kattis.dif_1;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                (1-in.nextInt())+" "
                        +(1-in.nextInt())+" "
                        +(2-in.nextInt())+" "
                        +(2-in.nextInt())+" "
                        +(2-in.nextInt())+" "
                        +(8-in.nextInt()));
        in.close();
    }
}