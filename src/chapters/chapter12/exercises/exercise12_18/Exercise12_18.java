package chapters.chapter12.exercises.exercise12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 1){
            System.out.println("Usage: java Exercise12_28 fileName");
            System.exit(0);
        }
        File directory = new File(args[0]);
        if (!directory.exists()) {
            System.out.println("File " + directory.getName() + " doesn't exist");
            System.exit(1);
        }
        if (!directory.isDirectory()) {
            System.out.println(directory.getName() + " is not a directory!");
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);
        File file = directories.remove(0);
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    directories.add(files[i]);
                }
                if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                        fillWithPackage(files[i]);
                }
            }
        }
    }

    private static void fillWithPackage(File file) throws FileNotFoundException {
        String[] s1 = file.getParent().split("\\\\");
        String s = "";
        try (
                Scanner input = new Scanner(file)

        ) {
            while (input.hasNext()) {
                s += "\n" + input.nextLine();
            }

            try (
                    PrintWriter output = new PrintWriter(file)
            ) {

                s ="package " +  s1[s1.length - 1] + ";\n" + s;
                output.println(s);
            }
        }
    }
}
