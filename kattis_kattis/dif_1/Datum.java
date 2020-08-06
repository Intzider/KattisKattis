package kattis_kattis.dif_1;

        import java.text.ParseException;
        import java.util.Date;
        import java.util.Scanner;
        import java.text.SimpleDateFormat;

public class Datum {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int     day = in.nextInt(),
                month = in.nextInt();
        String  date = day+"/"+month+"/"+2009;
        Date yourDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        String dayOfWeek = new SimpleDateFormat("EEEE").format(yourDate);
        System.out.println(dayOfWeek);
        in.close();
    }
}