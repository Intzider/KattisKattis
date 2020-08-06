package kattis_kattis.dif_1;

import java.util.Scanner;

public class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     L = in.nextInt(),
                x = in.nextInt(),
                curr = 0,
                attempt,
                groupNo = 0;
        String mode;
        for (int i = 0; i < x; i++) {
            mode = in.next();
            attempt = in.nextInt();
            if(mode.equals("enter") && curr+attempt<=L) {
                curr += attempt;
            }else
                groupNo++;
            if(mode.equals("leave")) {
                curr -= attempt;
                groupNo--;
            }
        }
        System.out.println(groupNo);
    }
}