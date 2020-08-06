package kattis_kattis.dif_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> mod = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            mod.add(in.nextInt()%42);
        }
        System.out.println(mod.size());
        in.close();
    }
}