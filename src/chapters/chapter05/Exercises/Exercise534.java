package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise534 {
    public static void main(String[] args) {
        int pcWins = 0;
        int userWins = 0;
        Scanner input = new Scanner(System.in);
        while (pcWins != 3 || userWins !=3) {
            int computer = (int)(Math.random()*3);
            System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor: ");
            int guess = input.nextInt();
            if (guess != 0 && guess != 1 && guess != 2) {
                System.out.println("Invalid input!");
            } else if (guess == 0 && computer == 2 || guess == 1 && computer == 0 || guess == 2 && computer == 1) {
                userWins++;
                System.out.println("You win! "+userWins+"-"+pcWins);
            } else if (guess == 0 && computer == 1 || guess == 1 && computer == 2 || guess == 2 && computer == 0) {
                pcWins++;
                System.out.println("PC win! "+userWins+"-"+pcWins);
            } else  {
                System.out.println("DRAW!");

            }
            if (userWins > 2) {
                System.out.println("CONGRATULATIONS-YOU WIN! " + userWins + "-" + pcWins);
                break;
            } else if (pcWins > 2) {
                System.out.println("GAME OVER! - PC WIN! " + userWins + "-" + pcWins);
                break;
            }
        }

    }
}
