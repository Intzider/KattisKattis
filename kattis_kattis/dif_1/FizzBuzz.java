package kattis_kattis.dif_1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     X = in.nextInt(),
                Y = in.nextInt(),
                N = in.nextInt();
        String prt = "";
        for (int i = 0; i < N; i++) {
            if((i+1)%X == 0)
                prt+="Fizz";
            if((i+1)%Y == 0)
                prt+="Buzz";
            if((i+1)%Y != 0 && (i+1)%X != 0)
                prt+=i+1;
            System.out.println(prt);
            prt="";
        }
        in.close();
    }
}