package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beavergnaw {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String[] DV = in.readLine().split(" ");
            if (DV[0].equals("0") && DV[1].equals("0"))
                break;

            double  D = Double.parseDouble(DV[0]),
                    volumeStosci = (2/3.0)*Math.PI*Math.pow((D/2), 3),
                    v = Math.pow(D,3)*Math.PI*(1/4.0) - Double.parseDouble(DV[1]) - volumeStosci,
                    d = Math.cbrt(v/((4/3.0)*Math.PI))*2;
            System.out.println(d);
        }
        in.close();
    }
}