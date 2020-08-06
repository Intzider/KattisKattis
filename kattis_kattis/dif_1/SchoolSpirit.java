package kattis_kattis.dif_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSpirit {

    private static double average(ArrayList<Integer> s){
        double avg = 0;
        for (int i = 0; i < s.size(); i++) {
            ArrayList<Integer> a = new ArrayList<>(s);
            a.remove(i);
            avg += groupScore(a, 0);
        }
        return avg/(s.size());
    }

    private static double groupScore(ArrayList<Integer> s, int i){
        if (i < s.size()){
            return  (s.get(i)*Math.pow(0.8, i))+groupScore(s, i+1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     n = in.nextInt();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(in.nextInt());
        System.out.println((0.2)*groupScore(s, 0));
        System.out.println((0.2)*average(s));
        in.close();
    }
}