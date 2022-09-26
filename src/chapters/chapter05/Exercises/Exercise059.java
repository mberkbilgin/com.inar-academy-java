package chapters.chapter05.Exercises;


import java.util.Scanner;

public class Exercise059 {
    public static void main(String[] args) {
        int hg = 0;
        int hg2 = 0;
        String str1 = "";
        String str2 = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int number = input.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println("Enter name of student:");
            String name = input.next();
            System.out.println("Enter score of student:");
            int score = input.nextInt();

            if (score > hg){
                hg = score;
                str1 = name;
            }else if(score < hg && score > hg2){
                hg2 = score;
                str2 = name;
            }
        }
        System.out.println("Name of student with highest score is "+str1+"\nhis/her score is "+hg);
        System.out.println("Name of student with second-highest score is "+str2+"\nhis/her score is "+hg2);
    }
}