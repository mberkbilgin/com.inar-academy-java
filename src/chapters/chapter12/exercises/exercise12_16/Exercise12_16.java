package chapters.chapter12.exercises.exercise12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 sourceFile oldStr newStr");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        String line = "";
        StringBuilder sb = new StringBuilder();
        try (
                Scanner input = new Scanner(sourceFile);

        ) {
            while (input.hasNext()) {
                line = input.nextLine();
                sb.append(line.replaceAll(args[1], args[2]) + "\n");
            }
        }
        try (
                PrintWriter output = new PrintWriter(sourceFile);
        ) {
            output.print(sb);
        }
    }
}
