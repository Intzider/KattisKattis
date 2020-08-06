package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNumbers {

    protected static int digitSum (int a){
        int sum = 0;
        while (a!=0){
            sum += a%10;
            a/=10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int     harshadNum = Integer.parseInt(in.readLine()),
                sum = digitSum(harshadNum);
        while(harshadNum%sum != 0){
            sum = digitSum(++harshadNum);
        }
        System.out.println(harshadNum);
        in.close();
    }
}