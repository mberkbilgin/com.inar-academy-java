package chapters.chapter12.exercises.exercise12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 filename");
            System.exit(0);

        }
        File file = new File(args[0]);
        String line = "";
        StringBuilder sb = new StringBuilder();
        if (!file.exists()) {
            System.out.println("File " + file + " doesn't exist");
            System.exit(1);
        }
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                line += input.nextLine() + " \n";
            }
            sb.append(line.replaceAll("\n\\s*\\{", " {") + "\n");
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(sb);
        }
    }
}
