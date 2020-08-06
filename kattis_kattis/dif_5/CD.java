package kattis_kattis.dif_5;

import java.util.HashSet;
import java.util.Scanner;

public class CD {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int     kn, ln, n = 0;
        while (true) {
            kn = in.nextInt();
            ln = in.nextInt();
            if (kn == 0 && ln == 0) {
                break;
            }
            n = 0;

            HashSet<Long> kAs = new HashSet<>();
            for (int i = 0; i < kn; i++) {
                kAs.add(in.nextLong());
            }

            for (int i = 0; i < ln; i++) {
                if(kAs.contains(in.nextLong()))
                    n++;
            }

            /*Set<Integer> lAs = new HashSet<>();
            for (int i = 0; i < ln; i++) {
                lAs.add(in.nextInt());
            }

            for (int k : kAs) {
                if (lAs.contains(k))
                    n++;
            }*/
        }
        in.close();
        System.out.println(n);
    }
}
