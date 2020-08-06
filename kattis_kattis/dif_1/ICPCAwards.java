package kattis_kattis.dif_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        in.nextLine();
        Map<String, String> winner = new HashMap<String,String>();
        for (int i = 0; i < n; i++) {
            String[] entry = in.nextLine().split(" ");
            if (!winner.containsKey(entry[0])) {
                winner.put(entry[0], entry[1]);
                System.out.println(entry[0]+" "+entry[1]);
                count++;
                if (count == 12)
                    break;
            }
        }
        in.close();
    }
}