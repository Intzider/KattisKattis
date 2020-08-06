package kattis_kattis.dif_3;

import java.util.LinkedList;
import java.util.Scanner;

public class ContinuousMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int     N = in.nextInt(),
                    median = 0,
                    num;
            LinkedList<Integer> A = new LinkedList<>();
            A.add(in.nextInt());
            median += A.get(0);
            for (int j = 1; j < N; j++) {
                num = in.nextInt();
                if (A.get(0) > num)
                    A.add(0, num);
                for (int k = 0; k < A.size(); k++) {
                    if (A.get(k) < num && k == A.size()-1){
                        A.add(num);
                        break;
                    }
                    if (A.get(k) == num){
                        A.add(k, num);
                        break;
                    }
                    if (A.get(k) > num && k < A.size()-1){
                        A.add(k, num);
                        break;
                    }
                }
                if(j%2 == 0)
                    median += A.get(j/2);
                else
                    median += (A.get(j/2)+A.get(j/2+1))/2;
            }
            System.out.println(median);
        }
        in.close();
    }
}