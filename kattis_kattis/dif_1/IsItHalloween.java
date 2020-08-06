package kattis_kattis.dif_1;

import java.io.OutputStream;
import java.util.Scanner;

public class IsItHalloween{

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String is = in.nextLine();
        if(is.equals("OCT 31") || is.equals("DEC 25"))
            System.out.println("yup");
        else
            System.out.println("nope");
        in.close();
    }
}