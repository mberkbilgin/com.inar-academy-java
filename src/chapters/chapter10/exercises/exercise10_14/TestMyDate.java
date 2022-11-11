package chapters.chapter10.exercises.exercise10_14;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println(date.getMonth()+"."+date.getDay()+"."+date.getYear());
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println(date2.getMonth()+"."+date2.getDay()+"."+date2.getYear());

    }
}
