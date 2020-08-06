package kattis_kattis.dif_1;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     l = in.nextInt(),
                r = in.nextInt();
        if (l == 0 && r == 0)
            System.out.println("Not a moose");
        else if (l == r)
            System.out.println("Even " + 2*l);
        else
            System.out.println("Odd " + 2*Math.max(l,r));
        in.close();
    }
}