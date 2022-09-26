package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0:");
        int number = input.nextInt();
        int pos = 0;
        int neg = 0;
        int count = 0;
        int sum = 0;

        double average = 0;
        while (number != 0) {
            if (number > 0)
                pos++;
            else if (number < 0)
                neg++;
            count++;
            sum += number;
            average =(double) sum / count;
            number = input.nextInt();
        }
        if (count == 0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }

    }
}
