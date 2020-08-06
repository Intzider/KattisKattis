package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(in.readLine());
            String[] stores = in.readLine().split(" ");
            int     min = Integer.parseInt(stores[0]),
                    max = Integer.parseInt(stores[0]);
            for (String s : stores){
                if (Integer.parseInt(s) > max)
                    max = Integer.parseInt(s);
                if (Integer.parseInt(s) < min)
                    min = Integer.parseInt(s);
            }
            System.out.println((max-min)*2);
        }
        in.close();
    }
}