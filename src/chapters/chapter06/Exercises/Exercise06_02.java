package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(sumDigit(number));
    }
    public static int sumDigit(int i){
        int k = 10;
        int sum = 0;
        while (i != 0){
            sum += i  % k;
            i = i / k;
        }
        return sum;
    }
}
