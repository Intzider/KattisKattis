package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kornislav {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = in.readLine().split(" ");
        int     min = Integer.parseInt(nums[0]),
                max = Integer.parseInt(nums[0]),
                max2 = 0;
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
            if (num[i]>max)
                max = num[i];
            if (num[i]<min)
                min = num[i];
        }
        for (int i = 0; i < nums.length; i++)
            if (num[i] == min){
                num[i] = 0;
                break;
            }
        for (int i = 0; i < nums.length; i++)
            if (num[i] == max){
                num[i] = 0;
                break;
            }

        for (int i = 0; i < num.length; i++) {
            if (num[i]>max2)
                max2 = num[i];
        }
        System.out.println(max2*min);
        in.close();
    }
}