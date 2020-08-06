package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gerrymandering {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");
        int     P = Integer.parseInt(line[0]),
                D = Integer.parseInt(line[1]);
        Map<String, ArrayList<Integer>> districts = new HashMap<>();
        for (int i = 0; i < P; i++) {
            String[] district = in.readLine().split(" ");
            if (!districts.containsKey(district[0])) {
                ArrayList<Integer> votes = new ArrayList<>();
                votes.add(0, Integer.parseInt(district[1]));
                votes.add(1, Integer.parseInt(district[2]));
                districts.put(district[0], votes);
            } else {
                ArrayList<Integer> votes = new ArrayList<>();
                ArrayList<Integer> oldVotes = districts.get(district[0]);
                votes.add(0, oldVotes.get(0) + Integer.parseInt(district[1]));
                votes.add(1, oldVotes.get(1) + Integer.parseInt(district[2]));
                districts.put(district[0], votes);
            }
        }
        int     wastedA, wA = 0,
                wastedB, wB = 0;
        double  totalVotes = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : districts.entrySet()){
            ArrayList<Integer> votes = entry.getValue();
            totalVotes += votes.get(0) + votes.get(1);
            if (votes.get(0) > votes.get(1)){
                wastedB = votes.get(1);
                wB += wastedB;
                wastedA = votes.get(0) - (((votes.get(0)+votes.get(1))/2)+1);
                wA += wastedA;
                System.out.println("A "+wastedA+" "+wastedB);
            }else{
                wastedA = votes.get(0);
                wA += wastedA;
                wastedB = votes.get(1) - (((votes.get(0)+votes.get(1))/2)+1);
                wB += wastedB;
                System.out.println("B "+wastedA+" "+wastedB);
            }
        }
        System.out.println((double)Math.abs(wA-wB)/totalVotes);
        in.close();
    }
}