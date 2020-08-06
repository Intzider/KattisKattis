package kattis_kattis.dif_1;

import java.util.Scanner;

public class Zamka {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int D = in.nextInt();
        int X = in.nextInt();
        in.close();
        int min = D, max = L;
        for (int i = L; i <= D; i++) {
            int sum = 0, num = i;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum==X){
                if(i<min)
                    min = i;
                if(i>max)
                    max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
