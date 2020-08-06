package kattis_kattis.dif_1;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cards = in.nextLine();
        int     T = 0,
                C = 0,
                G = 0,
                ans, n;
        for (int i = 0; i < cards.length(); i++) {
            if (cards.charAt(i) == 'T')
                T++;
            else if(cards.charAt(i) == 'C')
                C++;
            else G++;
        }
        ans = T*T + C*C + G*G;
        n = Math.min(T, C); n = Math.min(n, G);
        for (int i = 0; i < n; i++) {
            ans+=7;
        }
        System.out.println(ans);
        in.close();
    }
}