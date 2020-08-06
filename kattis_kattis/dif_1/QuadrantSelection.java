package kattis_kattis.dif_1;

import java.util.Scanner;

public class QuadrantSelection {

    private static int quadrant(int x, int y){
        if(x > 0)
            if (y > 0)
                return 1;
            else
                return 4;
        else
            if (y > 0)
                return 2;
            else
                return 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println(quadrant(x,y));
    }
}