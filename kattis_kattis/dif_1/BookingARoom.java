package kattis_kattis.dif_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int     r = in.nextInt(),
                n = in.nextInt();
        Set<Integer> rooms = new HashSet<>();
        if (r == n){
            System.out.println("too late");
            in.close();
        }else{
            for (int i = 0; i < n; i++)
                rooms.add(in.nextInt());
            Random rand = new Random();
            int randRoom = rand.nextInt(r+1);
            while ((randRoom == 0) || rooms.contains(randRoom))
                randRoom = rand.nextInt(r+1);
            System.out.println(randRoom);
        }
        in.close();
    }
}