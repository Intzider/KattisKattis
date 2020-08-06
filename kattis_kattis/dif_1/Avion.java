package kattis_kattis.dif_1;

import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, ans = "";
        for (int i = 0; i < 5; i++) {
            a = in.nextLine();
            if (a.contains("FBI"))
                ans += i+1 + " ";
        }
        if (ans.equals(""))
            System.out.println("HE GOT AWAY!");
        else
            System.out.println(ans);
        in.close();
    }
}