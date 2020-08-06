package kattis_kattis.dif_2;

import java.util.Scanner;

public class ADifferentProblem {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLong()){
            long n = in.nextLong();
            long m = in.nextLong();
            if(n>m)
                System.out.println(n-m);
            else
                System.out.println(m-n);
        }
        in.close();
    }
}