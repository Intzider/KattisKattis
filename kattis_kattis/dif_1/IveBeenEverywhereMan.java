package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class IveBeenEverywhereMan {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            int cities = Integer.parseInt(in.readLine());
            Set<String> uniqueCities = new HashSet<>();
            for (int j = 0; j < cities; j++) {
                String city = in.readLine();
                uniqueCities.add(city);
            }
            System.out.println(uniqueCities.size());
        }
        in.close();
    }
}