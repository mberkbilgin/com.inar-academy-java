package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int score = 0;
        System.out.println("Enter number of students:");
        int number = input.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println("Enter name of student:");
            String str = input.next();
            System.out.println("Enter score of student:");
            int highScore = input.nextInt();

            if(highScore > score){
                score = highScore;
                name= str ;
            }

        }
        System.out.println("Name of the studen with highest score is "+name+"\nand his/her score is "+score);

    }



}
