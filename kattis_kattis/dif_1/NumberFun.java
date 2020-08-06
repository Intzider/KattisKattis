package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFun {

    protected static String check(int a, int b, int c){
        String ans = "Possible";
        if (a+b == c)
            return ans;
        if (a-b == c)
            return ans;
        if (a*b == c)
            return ans;
        if ((double)a/b == c)
            return ans;
        return "Impossible";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String[] nums = in.readLine().split(" ");
            int     a = Integer.parseInt(nums[0]),
                    b = Integer.parseInt(nums[1]),
                    c = Integer.parseInt(nums[2]);
            System.out.println(check(Math.max(a,b),Math.min(a,b),c));
        }
        in.close();
    }
}