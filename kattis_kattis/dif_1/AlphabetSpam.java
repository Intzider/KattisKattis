package kattis_kattis.dif_1;

import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  spam = in.nextLine();
        int     ws = 0,
                lcl = 0,
                ucl = 0,
                sym = 0;
        for (int i = 0; i < spam.length(); i++) {
            char c = spam.charAt(i);
            if (c == 95)
                ws++;
            else if (c >=33 && c<65)
                sym++;
            else if (c>=65 && c<91)
                ucl++;
            else if (c>=91 && c<97)
                sym++;
            else if (c>=97 && c<123)
                lcl++;
            else if (c>=123 && c<=126)
                sym++;
        }
        System.out.println((double)ws/spam.length());
        System.out.println((double)lcl/spam.length());
        System.out.println((double)ucl/spam.length());
        System.out.println((double)sym/spam.length());
        in.close();
    }
}