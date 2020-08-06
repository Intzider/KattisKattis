package kattis_kattis.dif_9;

import java.util.Arrays;
import java.util.Scanner;

public class TravellingSalesperson2D {

    private static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[][] dest = new double[n][2];
        for (int i = 0; i < n; i++) {
            dest[i][0] = in.nextDouble();
            dest[i][1] = in.nextDouble();
        }
        in.close();
        int[] way = new int[n];
        way[0] = 0;
        int min, index = 0, k=0;
        for (int i = 0; i < n; i++) {
            way[i] = index;
            min = Integer.MAX_VALUE;  k = index; index = 0;
            for (int j = 0; j < n; j++) {
                if(!contains(way,j)) {
                    int dist = (int) Math.sqrt(Math.pow(dest[k][0] - dest[j][0], 2) + Math.pow(dest[k][1] - dest[j][1], 2));
                    if (min >= dist) {
                        min = dist;
                        index = j;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(way[i]);
        }
    }
}
