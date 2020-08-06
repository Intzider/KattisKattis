package kattis_kattis.dif_3;

import java.util.Scanner;

public class TenKindsOfPeople {

    private static boolean hasPath (char[][] map, char i, int startx, int starty, int endx, int endy){
        boolean check = false;
        if (i != map[startx][starty] || i != map[endx][endy])
            return false;
        if (startx == endx && starty == endy)
            check = true;
        if(startx+1 < map.length && !check)
            check = hasPath(map, i, startx+1, starty, endx, endy);
        if(starty+1 < map[0].length && !check)
            check = hasPath(map, i, startx, starty+1, endx, endy);
        if(!(startx-1<0) && !check)
             check = hasPath(map, i,startx-1, starty, endx, endy);
        if(!(starty-1<0) && !check)
            check = hasPath(map, i, startx, starty-1, endx, endy);
        return check;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] map = new char[in.nextInt()][in.nextInt()];
        for (int i = 0; i < map.length; i++) {
            String nex = in.next();
            char[] arr = nex.toCharArray();
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = arr[j];
            }
        }
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int     x1 = in.nextInt()-1,
                    y1 = in.nextInt()-1,
                    x2 = in.nextInt()-1,
                    y2 = in.nextInt()-1;
            boolean hasBinary = hasPath(map, '0', x1, y1, x2, y2);
            boolean hasDecimal = hasPath(map, '1', x1, y1, x2, y2);
            if (!hasBinary && !hasDecimal)
                System.out.println("neither");
            else if (hasBinary)
                System.out.println("binary");
            else if (hasDecimal)
                System.out.println("decimal");
        }

        in.close();
    }
}