package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        System.out.println("Enter the month :");
        int month = input.nextInt();
        if (month < 1 && month > 12) {
            System.out.println("Invalid input!");
        } else {
            printMonth(month, year);
        }
    }

    public static void printMonth(int month, int year) {
        System.out.println("         " + getMonth(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        printDays(month, year);
    }

    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            default:
                return "December";
        }
    }

    public static void printDays(int month, int year) {
        for (int i = 0; i < getStartDay(month, year); i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= getNumberOfDaysInMonth(month, year); i++) {
            System.out.printf("%-4d", i);
            if ((i + getStartDay(month, year)) % 7 == 0)
                System.out.println();
        }
    }

    public static int getStartDay(int month, int year) {
        int h = 0;
        int q = 0;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        h = (q + ((13 * (m + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J)) % 7;
        return h;
    }

    public static int getTotalNumberOfDays(int month, int year) {
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(i, year);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (!isLeapYear(year) && month == 2) {
            return 28;
        } else {
            return 30;
        }
    }
    public static boolean isLeapYear(int i) {
        if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}


