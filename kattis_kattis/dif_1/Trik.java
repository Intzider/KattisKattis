package kattis_kattis.dif_1;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] cups = "100".toCharArray();
        String moves = in.nextLine();
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'A'){
                char p = cups[0];
                cups[0] = cups[1];
                cups[1] = p;
            }else if (moves.charAt(i) == 'B'){
                char p = cups[1];
                cups[1] = cups[2];
                cups[2] = p;
            }else if (moves.charAt(i) == 'C'){
                char p = cups[2];
                cups[2] = cups[0];
                cups[0] = p;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cups[i] == '1')
                System.out.println(i+1);
        }
        in.close();
    }
}