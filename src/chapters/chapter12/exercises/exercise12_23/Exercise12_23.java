package chapters.chapter12.exercises.exercise12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 fileName");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + file + " doesn't exist");
            System.exit(1);
        }
        double sum = 0;
        int count = 0;
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                sum += input.nextDouble();
                count++;
            }
        }
        System.out.println("The total number is " + sum);
        System.out.println("The average is " + (sum / count));
    }
}
