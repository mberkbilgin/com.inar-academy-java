package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_37 {
    public static void main(String[] args) {
        String[][] statesAndCapital = fillTheArr();
        play(statesAndCapital);

    }

    public static void play(String[][] statesAndCapital) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int correctAnswer = 0;
        int i = 0;
        while (count < statesAndCapital.length) {

            System.out.println("What is the capital of " + statesAndCapital[i][0] + "?");
            String answer = input.nextLine();
            if (isEqual(answer,statesAndCapital[i][1])) {
                System.out.println("Your answer is correct");
                correctAnswer++;
            } else {
                System.out.println("The correct answer shoul be " + statesAndCapital[i][1]);
            }
            i++;
            count++;
        }
        System.out.println("The correct answer is " + correctAnswer);
    }

    private static boolean isEqual(String answer, String s) {
        if((answer.length() != s.length())){
            return false;
        }
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static String[][] fillTheArr() {
        String[][] str = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return str;
    }
}
