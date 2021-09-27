package Facade.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date getExactDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr = format.format(new Date());
        return format.parse(dateStr);
    }

    public static long calculateDifferenceByDay(Date firstDate, Date lastDate){

        long dayFactor = 24 * 60 * 60* 1000;
        long first = firstDate.getTime();
        long last = lastDate.getTime();

        long difference = (first - last) / dayFactor;
        return difference;

    }

    public static long yearOfDate(Date date){
        String yearStr = new SimpleDateFormat("yyyy").format(date);
        return Long.valueOf(yearStr);
    }

    public static long monthOfDate(Date date){
        String monthStr = new SimpleDateFormat("MM").format(date);
        return Long.valueOf(monthStr);
    }

    public static Date createExpirationDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
