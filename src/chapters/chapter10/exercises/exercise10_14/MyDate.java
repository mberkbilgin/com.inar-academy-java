package chapters.chapter10.exercises.exercise10_14;

import java.util.GregorianCalendar;

public class MyDate {
   private long year;
   private long month;
   private long day;

    public MyDate(long year, long month, long day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime) {
        this(calendar(elapsedTime).get(GregorianCalendar.YEAR),
                calendar(elapsedTime).get(GregorianCalendar.MONTH),
                calendar(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH));
    }

    public MyDate() {
        this(System.currentTimeMillis());
    }
    public static GregorianCalendar calendar(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        return date;
    }

    public long getYear() {
        return year;
    }

    public long getMonth() {
        return month;
    }

    public long getDay() {
        return day;
    }
    public void setDate(long elapsedTime){
        this.year = calendar(elapsedTime).get(GregorianCalendar.YEAR);
        this.month = calendar(elapsedTime).get(GregorianCalendar.MONTH);
        this.day = calendar(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH);
    }
}
