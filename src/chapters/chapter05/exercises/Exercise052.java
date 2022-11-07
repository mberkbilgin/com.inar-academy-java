package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 10 ;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String str = "";


        while (count < NUMBER_OF_QUESTIONS){
            int a = (int)(Math.random()*15) + 1;
            int b =(int)(Math.random()*15) + 1;
            System.out.printf("%d - %d = ?",a,b);
            count++;
          int  answer = input.nextInt();
            if (a - b == answer){
                System.out.println("You got it!");
                str += "\n"+a+" - "+b+" = "+answer+" CORRECT!";
            }else
                System.out.println("Wrong answer. Should be "+(a-b));
            str += "\n"+a+" - "+b+" = "+answer+" WRONG!";

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("\nTest time is "+ testTime / 1000 + " second\n" );
        System.out.print(str);
    }
}
