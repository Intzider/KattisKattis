package kattis_kattis.dif_1;

import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        if(in.nextInt()%2 == 0)
            System.out.println("possible");
        else
            System.out.println("impossible");
        in.close();
    }
}