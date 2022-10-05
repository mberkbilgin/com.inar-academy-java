package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for milliseconds:");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis){
        long totalSecond = millis / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        String hour = totalHour + "";
        String minute = currentMinute + "";
        String seconds = currentSecond + "";
        String total = hour+":"+minute+":"+seconds;
        return total;
    }
}
