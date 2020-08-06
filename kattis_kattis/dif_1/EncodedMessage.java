package kattis_kattis.dif_1;

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            char[] code = in.nextLine().toCharArray();
            int m = (int)Math.sqrt(code.length);
            for (int j = 0; j < m; j++)
                for (int k = 1; k <= m; k++)
                    System.out.print(code[k*m-j - 1]);
            System.out.println();
        }
        in.close();
    }
}