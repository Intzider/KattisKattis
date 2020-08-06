package kattis_kattis.dif_5;

import java.util.HashSet;
import java.util.Scanner;

public class CD2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jackn, jilln, count = 0;
        while (true) {
            String sk = scan.nextLine();
            String[] check = new String[2];
            if(!sk.equals("0 0") && !sk.equals(""))
                check = sk.split(" ");
            else{
                check[0] = "0";
                check[1] = "0";
            }
            if(check[0] == "0" && check[1] == "0")
                break;
            else {
                jackn = Integer.parseInt(check[0]);
                jilln = Integer.parseInt(check[1]);
            }
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < jackn; i++) {
                String cd = scan.next();
                set.add(cd);
            }

            count = 0;
            for (int i = 0; i < jilln; i++) {
                String cd = scan.next();
                if (set.contains(cd)) {
                    count++;
                }
            }
            scan.nextLine();
        }
        System.out.println(count);
    }
}
/*
3 3
1
2
3
1
2
4
2 2
1
2
1
5
0 0
*/
