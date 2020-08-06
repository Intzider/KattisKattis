package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class LostLineup {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] blownOrder = in.readLine().split(" ");
        Map<Integer, Integer> order = new TreeMap<>();
        for (int i = 0; i < n - 1; i++) {
            order.put(Integer.parseInt(blownOrder[i]), i+2);
        }
        System.out.print("1");
        for (Map.Entry<Integer,Integer> entry : order.entrySet())
            System.out.print(" "+entry.getValue());
        in.close();
    }
}