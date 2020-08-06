package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PokerHand {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] hand = in.readLine().split(" ");
        Map<Character, Integer> strength= new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            if (!strength.containsKey(hand[i].charAt(0)))
                strength.put(hand[i].charAt(0), 1);
            else 
                strength.replace(hand[i].charAt(0), strength.get(hand[i].charAt(0))+1);
        }
        int min = 1;
        for (Map.Entry<Character, Integer> entry : strength.entrySet()) {
            if(entry.getValue() > min)
                min = entry.getValue();
        }
        System.out.println(min);
        in.close();
    }
}