package kattis_kattis.dif_1;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n, t, h, mph, dist;
        while((n = in.nextInt()) != -1){
            h = 0; dist = 0;
            for (int i = 0; i < n; i++) {
                mph = in.nextInt();
                t = in.nextInt();
                if(i == 0) {
                    h = t;
                }else{
                    t = t-h;
                    h = t+h;
                }
                dist += mph * t;
            }
            System.out.println(dist + " miles");
        }
        in.close();
    }
}