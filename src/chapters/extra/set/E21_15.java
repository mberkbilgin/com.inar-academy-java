package chapters.extra.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E21_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println("What is " + num1 + " + " + num2 + " = ");
        Set<Integer> answers = new HashSet<>();
        int answer;
        do {
            answer = input.nextInt();
            if (num1 + num2 == answer) {
                System.out.println("CORRECT");
            } else if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.println("Try again");
            } else {
                answers.add(answer);
                System.out.println("WRONG!");
                System.out.println("Try again");
            }
        } while (num1 + num2 != answer);
    }
}
