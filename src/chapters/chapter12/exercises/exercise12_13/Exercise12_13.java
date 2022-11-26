package chapters.chapter12.exercises.exercise12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_13 filename");
            System.exit(0);
        }
        File file = new File(args[0]);
        String line = "";
        int characters = 0;
        int words = 0;
        int lines = 0;
        if (!file.exists()) {
            System.out.println("File " + file + " doesn't exist");
            System.exit(1);
        }
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                line += input.nextLine();
                lines++;
                words = countOfWords(line);
                characters = countOfChar(line);
            }
        }
        System.out.print("Number of lines = " + lines
                + "\nNumber of words = " + words
                + "\nNumber of characters = " + characters);
    }

    public static int countOfChar(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (!(line.charAt(i) == ' ') && !(line.charAt(i) == '\n')) {
                count++;
            }
        }
        return count;
    }

    private static int countOfWords(String line) {
        String[] arr = line.split(" ");
        return arr.length;

    }
}
