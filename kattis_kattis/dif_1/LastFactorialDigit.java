package kattis_kattis.dif_1;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt(), fact, mult = 1;
        for (int i = 0; i < n; i++) {
            fact = in.nextInt();
            if(fact == 0) {
                System.out.println("1");
                break;
            }else if(fact < 5){
                for (int j = 1; j <= fact; j++) {
                    mult *= j;
                }
                System.out.println(mult%10);
                mult = 1;
            }else{
                System.out.println("0");
            }
        }
        in.close();
    }
}