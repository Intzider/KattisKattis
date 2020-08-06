package kattis_kattis.dif_1;

import java.io.*;

public class FiftyShadesOfPink {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        OutputStreamWriter out = new OutputStreamWriter(System.out);
        int     n = Integer.parseInt(in.readLine()),
                count = 0;
        for (int i = 0; i < n; i++) {
            String line = in.readLine().toLowerCase();
            if (line.contains("pink") || line.contains("rose"))
                count++;
        }
        if (count == 0)
            out.write("I must watch Star Wars with my daughter");
        else
            System.out.println(count);
        in.close();
        out.close();
    }
}