package kattis_kattis.dif_1;

import java.util.Scanner;

public class DifferentDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1, x2, y1, y2, p, pdist;
        while((x1 = in.nextDouble()) != 0){
            y1 = in.nextDouble();
            x2 = in.nextDouble();
            y2 = in.nextDouble();
            p = in.nextDouble();
            pdist = Math.pow(Math.pow(Math.abs(x1-x2),p)+Math.pow(Math.abs(y1-y2),p),1/p);
            System.out.println(pdist);
        }
        in.close();
    }
}