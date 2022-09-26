package chapters.chapter05.Listings;

import java.util.Scanner;

public class Listing054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int  NUMBER_OF_QUESTONS = 5;
        int i = 0;
        double a = System.currentTimeMillis();
        String str = "";
        int correct = 0;
        int wrong = 0;

        while(i < NUMBER_OF_QUESTONS){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            System.out.printf("%nWhat is %d - %d ?",number1,number2);
            int answer = input.nextInt();
            if(answer == number1 - number2) {
                System.out.println("You are correct!");
                str += "\n"+number1 +" - "+number2+" = "+answer+" correct";
                correct++;
            }
            else{
                System.out.println("Your answer is wrong");
                System.out.printf("%d - %d should be %d",number1,number2,number1-number2);
                str += "\n"+number1 +" - "+number2+" = "+answer+" wrong";
                wrong++;
            }
            i++;
        }
        double b = (System.currentTimeMillis() - a)/1000;
        System.out.println("\nNumber of correct answer is "+correct);
        System.out.println("Number of wrong answer is "+wrong);
        System.out.println("\n Test time is "+b+" second");
        System.out.print(str);

    }
}
