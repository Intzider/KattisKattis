package kattis_kattis.dif_1;

import java.util.Scanner;

public class Hiss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mic = in.nextLine();
        if(mic.contains("ss"))
            System.out.println("hiss");
        else
            System.out.println("no hiss");
    }
}