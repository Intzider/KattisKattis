package kattis_kattis.dif_1;

import java.util.HashMap;
import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     N = in.nextInt(),
                sum = 0;
        String  B = in.next(),
                card;
        HashMap<Character, Integer> nonD = new HashMap<>(){{
            put('A', 11);
            put('K', 4);
            put('Q', 3);
            put('J', 2);
            put('T', 10);
            put('9', 0);
            put('8', 0);
            put('7', 0);
        }};
        HashMap<Character, Integer> D = new HashMap<>(){{
            put('A', 11);
            put('K', 4);
            put('Q', 3);
            put('J', 20);
            put('T', 10);
            put('9', 14);
            put('8', 0);
            put('7', 0);
        }};
        for (int i = 0; i < 4 * N; i++) {
            card = in.next();
            if (card.charAt(1) == B.charAt(0))
                sum += D.get(card.charAt(0));
            else
                sum += nonD.get(card.charAt(0));
        }
        System.out.println(sum);
        in.close();
    }
}