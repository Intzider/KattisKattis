package kattis_kattis.dif_1;

        import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((int)Math.ceil(in.nextInt()/Math.sin(in.nextDouble()/180*Math.PI)));
        in.close();
    }
}