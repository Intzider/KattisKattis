package kattis_kattis.dif_1;

import java.util.Scanner;

public class Autori {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("-");
        for (String str : input) {
            System.out.print(str.charAt(0));
        }
        in.close();
    }
}
