package kattis_kattis.dif_3;

import java.io.*;
import java.util.Arrays;

public class ContinuousMedian2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            int     N = Integer.parseInt(in.readLine()),
                    median = 0;
            String[] a = in.readLine().split(" ");
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[0] = Integer.parseInt(a[j]);
                Arrays.sort(A);
                if(j%2 == 0)
                    median += A[(A.length-1) - j/2];
                else
                    median += (A[(A.length-1) - j/2]+A[(A.length-1) - (j/2)-1])/2;
            }
            System.out.println(median);
        }
        in.close();
    }
}