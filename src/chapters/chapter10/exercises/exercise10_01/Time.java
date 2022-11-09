package chapters.chapter10.exercises.exercise10_01;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this.hour = (int) (elapsedTime / (60 * 60 * 1000) % 24);
        this.minute = (int) (elapsedTime / (60 * 1000) % 60);
        this.second = (int) (elapsedTime / 1000 % 60);

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) totalMinutes % 60;

        long totalHour = totalMinutes / 60;
        this.hour = (int) totalHour % 24;


    }
}
