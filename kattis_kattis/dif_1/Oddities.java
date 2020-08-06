package kattis_kattis.dif_1;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(),
                br;
        for (int i = 0; i < n; i++) {
            if((br = in.nextInt())%2 == 0)
                System.out.println(br+" is even");
            else
                System.out.println(br+ " is odd");
        }
        in.close();
    }
}