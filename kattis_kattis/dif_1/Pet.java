package kattis_kattis.dif_1;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     winner = 0, points = 0, wPoints = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++)
                points += in.nextInt();
            if (points > wPoints) {
                wPoints = points;
                winner = i + 1;
            }
            points = 0;
        }
        System.out.println(winner+" "+wPoints);
        in.close();
    }
}