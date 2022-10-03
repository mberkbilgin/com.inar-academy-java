package chapters.chapter06.Exercises;

public class Exercise06_16 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020 ; i++) {
            System.out.println("Number of days in "+i+" is "+numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        boolean isleapYear = (year % 4 == 0) &&((year % 100 != 0) || (year % 400 == 0 ));
        if(isleapYear){
            return 366;
        }else
            return 365;
    }
}
