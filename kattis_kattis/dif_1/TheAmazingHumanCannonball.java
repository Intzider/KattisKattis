package kattis_kattis.dif_1;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double  v0 = in.nextDouble(),
                    fi = in.nextDouble(),
                    x1 = in.nextDouble(),
                    h1 = in.nextDouble(),
                    h2 = in.nextDouble(),
                    t, y;
            t = x1/(v0*Math.cos(fi/180*Math.PI));
            y = v0*t*Math.sin(fi/180*Math.PI) - 0.5*Math.pow(t,2)*9.81;
            if (y > (h1+1) && y < (h2-1))
                System.out.println("Safe");
            else
                System.out.println("Not safe");
        }
        in.close();
    }
}