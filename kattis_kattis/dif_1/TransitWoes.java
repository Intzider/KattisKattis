package kattis_kattis.dif_1;

import java.util.Scanner;

public class TransitWoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int
        s = in.nextInt(),
        t = in.nextInt(),
        n = in.nextInt();
        int[] d = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            d[i] = in.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int sum = d[0];
        for (int i = 0; i < n; i++) {
            if(sum/c[i]<1)
                sum = c[i];
            else
                if(sum%c[i]!=0)
                    sum = (sum/c[i]+1)*c[i];
                else
                    sum = (sum/c[i])*c[i];
            sum+= b[i] + d[i+1];
        }
        if(sum<=t)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}