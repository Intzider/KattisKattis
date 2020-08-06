package kattis_kattis.dif_1;

import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  cypher = in.nextLine();
        int     days = 0;
        for (int i = 0; i < cypher.length(); i++) {
            if (i%3 == 0){
                if (cypher.charAt(i) != 'P')
                    days++;
            }else if (i%3 == 1){
                if (cypher.charAt(i) != 'E')
                    days++;
            }else {
                if (cypher.charAt(i) != 'R')
                    days++;
            }
        }
        System.out.println(days);
        in.close();
    }
}