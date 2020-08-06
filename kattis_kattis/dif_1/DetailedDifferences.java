package kattis_kattis.dif_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DetailedDifferences {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        OutputStreamWriter out = new OutputStreamWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String  one = in.readLine(),
                    two = in.readLine();
            out.write(one+"\n");
            out.flush();
            out.write(two+"\n");
            out.flush();
            for(int j = 0; j < one.length(); j++) {
                if (one.charAt(j) == two.charAt(j))
                    out.write('.');
                else
                    out.write('*');
            }
            out.write("\n\n");
            out.flush();
        }
        in.close();
        out.close();
    }
}