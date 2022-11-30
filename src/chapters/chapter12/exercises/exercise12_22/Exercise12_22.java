package chapters.chapter12.exercises.exercise12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 sourceFile oldStr newStr");
            System.exit(0);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }
        if (!sourceFile.isDirectory()) {
            System.out.println(sourceFile + " is not a directory");
            System.exit(2);

        }
        File[] files = sourceFile.listFiles();
        if (files == null) {
            System.out.println(sourceFile + " is empty");
            System.exit(3);
        }
        String oldStr = args[1];
        String newStr = args[2];
        for (File file : files) {
            changeString(file, oldStr, newStr);

        }
    }

    public static void changeString(File file, String oldStr, String newStr) throws FileNotFoundException, FileNotFoundException {
        String s1;
        StringBuilder s2 = new StringBuilder();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            s1 = input.nextLine();
            s2.append(s1.replaceAll(oldStr, newStr));
        }
        input.close();
        PrintWriter output = new PrintWriter(file);
        output.print(s2);
        output.close();
    }
}

