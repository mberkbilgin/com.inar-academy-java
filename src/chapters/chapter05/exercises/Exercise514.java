package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        int i ;

        if(number1 < number2)
            i = number1;
        else
            i = number2;

        while(i>0){
            if (number1 % i == 0 && number2 % i == 0)
                break;
            i--;
        }
        System.out.println(number1+" and "+number2+"'s GCD is "+i);

    }
}
