package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise528 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year: ");
        int day = input.nextInt();
        for (int month = 1; month <= 12 ; month++) {
            switch (month){
                case 1:
                    System.out.print("January "); break;
                case 2:
                    System.out.print("February "); break;
                case 3:
                    System.out.print("March "); break;
                case 4:
                    System.out.print("April "); break;
                case 5:
                    System.out.print("May "); break;
                case 6:
                    System.out.print("June "); break;
                case 7:
                    System.out.print("July "); break;
                case 8:
                    System.out.print("August "); break;
                case 9:
                    System.out.print("September "); break;
                case 10:
                    System.out.print("October "); break;
                case 11:
                    System.out.print("November "); break;
                case 12:
                    System.out.print("December ");
            }
            switch (day % 7){
                case 1:
                    System.out.print("1, "+year+" is Monday\n"); break;
                case 2:
                    System.out.print("1, "+year+" is Tuesday\n"); break;
                case 3:
                    System.out.print("1, "+year+" is Wednesday\n"); break;
                case 4:
                    System.out.print("1, "+year+" is Thursday\n"); break;
                case 5:
                    System.out.print("1, "+year+" is Friday\n"); break;
                case 6:
                    System.out.print("1, "+year+" is Saturday\n"); break;
                case 0:
                    System.out.print("1, "+year+" is Sunday\n");

            }
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                day += 31;
            } else if (month==4 || month==6 || month==9 || month==11 ) {
                day +=30;
            }else
                if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                    day +=29;
                else
                    day +=28;
        }


    }
}
