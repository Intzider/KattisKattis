package kattis_kattis.dif_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, ans = "yes";
        Set<String> duplicates = new HashSet<>();
        while(in.hasNext()){
            a = in.next();
            if (duplicates.contains(a)){
                ans = "no";
                break;
            }
            duplicates.add(a);
        }
        System.out.println(ans);
        in.close();
    }
}