package chapters.extra;

import java.util.ArrayList;
import java.util.Scanner;

public class E07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores and finish a negative number");
        ArrayList<Number> scores = new ArrayList<Number>();
        int scr = input.nextInt();
        while (scr >= 0) {
            if (scr > 100) {
                System.out.println("The score should be bellow than 100. Try again");
                scr = input.nextInt();
            } else {
                scores.add(scr);
                scr = input.nextInt();
            }
        }
        double average = averageOfList(scores);
        belowOrEqualOrAbove(scores, average);
    }

    private static void belowOrEqualOrAbove(ArrayList<Number> scores, double average) {
        int countOfEqual = 0;
        int countOfBelow = 0;
        int countOfAbove = 0;
        for (int i = 0; i < scores.size(); i++) {
            if ((int) scores.get(i) < average) {
                countOfBelow++;
            } else if ((int) scores.get(i) == average) {
                countOfEqual++;
            } else {
                countOfAbove++;
            }
        }
        System.out.println("The number of below score is " + countOfBelow
                + "\nThe number of equal score is " + countOfEqual
                + "\nThe number of above score is " + countOfAbove);
    }

    private static double averageOfList(ArrayList<Number> scores) {
        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += (int) scores.get(i);
        }
        return sum / scores.size();
    }
}
