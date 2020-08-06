package kattis_kattis.dif_1;

import java.util.*;

public class BaconEggsAndSpam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, ArrayList<String>> bill = new TreeMap<>();
        while (n != 0){
            String[] order = in.nextLine().split(" ");
            for (int i = 1; i < order.length; i++) {
                if (!bill.containsKey(order[i])) {
                    ArrayList<String> names = new ArrayList<>();
                    names.add(order[0]);
                    bill.put(order[i], names);
                }else{
                    ArrayList<String> names = bill.get(order[i]);
                    names.add(order[0]);
                    bill.put(order[i], names);
                }
            }
            if (--n == 0){
                for (Map.Entry<String, ArrayList<String>> entry : bill.entrySet()){
                    ArrayList<String> names = entry.getValue();
                    Collections.sort(names);
                    System.out.print(entry.getKey());
                    for (String name : names)
                        System.out.print(" "+name);
                    System.out.println();
                }
                System.out.println();
                bill.clear();
                n = Integer.parseInt(in.nextLine());
            }
        }
        in.close();
    }
}