package chapters.chapter11.exercises.exercise11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer = number1 + number2;
        System.out.printf("What is %d + %d?", number1, number2);
        int user = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (user != answer) {

            if (list.contains(user)) {
                System.out.println("You already entered " + user);
                System.out.printf("Wrong answer. What is %d + %d?", number1, number2);
            } else {
                list.add(user);
                System.out.printf("Wrong answer. What is %d + %d?", number1, number2);
            }
            user = input.nextInt();
        }
        System.out.println("You got it!");


    }
}
