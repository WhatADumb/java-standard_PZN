package firmansyah.java.classes;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalenderApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
