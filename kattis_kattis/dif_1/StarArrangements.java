package kattis_kattis.dif_1;

import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = in.nextInt();
        System.out.println(stars+":");
        for (int i = 2; i < stars / 2 + 2; i++) {
            for (int j = i-1; j <= i; j++) {
                if (stars%(i+j) == 0)
                    System.out.println(i+","+j);
                else if ((stars-i)%(i+j)==0)
                    System.out.println(i+","+j);
            }
        }
        in.close();
    }
}