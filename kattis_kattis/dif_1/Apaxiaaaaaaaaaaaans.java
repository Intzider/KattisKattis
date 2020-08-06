package kattis_kattis.dif_1;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(i-1))
                System.out.print(name.charAt(i));
        }
        in.close();
    }
}