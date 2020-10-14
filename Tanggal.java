package algodat.midexam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tanggal {
    public static Date date = new Date();
    public static Calendar c = Calendar.getInstance();
    public static DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd MMMMM yyyy [HH:mm:ss]");

    public static String waktu() {
        kirimanBaru();
        return dateFormat.format(date);
    }

    public static void kirimanBaru() {
        c.setTime(date);
        c.add(Calendar.DAY_OF_WEEK, 3);
        c.add(Calendar.HOUR_OF_DAY, 10);
        date = c.getTime();
    }
    public static void seasonChange() {
        c.setTime(date);
        c.add(Calendar.MONTH, 1);
        date = c.getTime();
    }
}
