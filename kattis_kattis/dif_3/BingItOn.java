package kattis_kattis.dif_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BingItOn {
    //time limit exceeded
    private static void dictionary (Map<String, Integer> dict, String a){
        if (!dict.containsKey(a))
            dict.put(a, 0);
        else
            dict.put(a, dict.get(a) + 1);
        if (a.length()>1)
            dictionary(dict, a.substring(0, a.length()-1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        int     n = Integer.parseInt(in.readLine());
        Map<String, Integer> dict = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String a = in.readLine();
            dictionary(dict, a);
            System.out.println(dict.get(a));
        }
        in.close();
    }
}