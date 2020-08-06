package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spavanac {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");
        int     H = Integer.parseInt(line[0]),
                M = Integer.parseInt(line[1]);
        if (M-45 < 0)
            H = (H + -1 + 24) % 24;
        M = (M+15)%60;
        System.out.println(H+" "+M);
        in.close();
    }
}