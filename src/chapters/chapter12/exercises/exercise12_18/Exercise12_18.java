package chapters.chapter12.exercises.exercise12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_28 fileName");
            System.exit(0);
        }
        File mainDirectory = new File(args[0]);
        if (!mainDirectory.exists()) {
            System.out.println("File " + mainDirectory.getName() + " doesn't exist");
            System.exit(1);
        }
        if (!mainDirectory.isDirectory()) {
            System.out.println(mainDirectory.getName() + " is not a directory!");
            System.exit(2);
        }
        File[] mainFiles = mainDirectory.listFiles();
        if (mainFiles == null) {
            System.out.println(mainFiles + " is empty");
            System.exit(3);
        }
        ArrayList<File> directories = new ArrayList<>();
        for (int i = 0; i < mainFiles.length; i++) {
            if (mainFiles[i].isDirectory() && mainFiles[i].getName().contains("chapter")) {
                directories.add(mainFiles[i]);
            }
        }
        if (directories.isEmpty()) {
            System.out.println("There is no directory in " + mainDirectory);
            System.exit(4);
        }
        for (File i :
                directories
        ) {
            File[] files = i.listFiles();
            for (int j = 0; j < files.length; j++) {
                if (files[j].isFile() && files[j].getName().contains(".java")) {
                    writePackage(files[j]);
                }
            }
        }

    }

    private static void writePackage(File file) throws FileNotFoundException {
        try (Scanner input = new Scanner(file);) {
            String firstLine = "package " + file.getParent() + "." + file.getName();
            String str = "";
            while (input.hasNext()) {
                str += "\n" + input.nextLine();
            }
            PrintWriter output = new PrintWriter(file);
            output.print(firstLine);
            output.println(str);
            output.close();

        }
    }


}
