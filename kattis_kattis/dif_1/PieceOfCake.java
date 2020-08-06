package kattis_kattis.dif_1;

import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(),
                l = in.nextInt(),
                w = in.nextInt(),
                h = 4;
        in.close();
        if(n-l > l)
            l = n-l;
        if(n-w > w)
            w = n-w;
        System.out.println(w*l*h);
    }
}