package kattis_kattis.dif_1;

import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
}
