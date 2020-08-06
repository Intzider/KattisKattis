package kattis_kattis.dif_1;

import java.util.Scanner;

public class NastyHacks {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long r = in.nextLong();
            long e = in.nextLong();
            long c = in.nextLong();
            if(r==(e-c))
                System.out.println("does not matter");
            else if(r<(e-c))
                System.out.println("advertise");
            else if(r>(e-c))
                System.out.println("do not advertise");
        }
    }
}
