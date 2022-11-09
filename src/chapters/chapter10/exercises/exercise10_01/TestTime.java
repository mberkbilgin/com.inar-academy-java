package chapters.chapter10.exercises.exercise10_01;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Time is " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("____________________________________________");
        Time time2 = new Time(555550000);
        System.out.println("Time is " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("____________________________________________");
        Time time3 = new Time(17,25,45);
        System.out.println("Time is " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
        System.out.println("____________________________________________");

    }
}
