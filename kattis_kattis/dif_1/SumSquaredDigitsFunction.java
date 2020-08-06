package kattis_kattis.dif_1;

import java.util.Scanner;

public class SumSquaredDigitsFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     c = in.nextInt();
        for (int i = 0; i < c; i++) {
            int     K = in.nextInt(),
                    b = in.nextInt(),
                    n = in.nextInt(),
                    pow = 0, a = 0;
            while (Math.pow(b,pow) <= n){
                pow++;
            }
            pow--;
            for (int j = pow; j > 0; j--) {
                a += (int)Math.pow((int)(n/Math.pow(b,j)),2);
                n -= (int)(n/Math.pow(b,j))*(int)Math.pow(b,j);
            }
            a += n*n;
            System.out.println(K+" "+a);
        }
        in.close();
    }
}