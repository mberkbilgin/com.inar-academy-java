package chapters.chapter12.exercises.exercise12_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 fileName");
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
            if (mainFiles[i].isDirectory() && mainFiles[i].getName().contains("chapter")
) {
                directories.add(mainFiles[i]);
            }
        }
        if (directories.isEmpty()) {
            System.out.println("There is no directory in " + mainDirectory);
            System.exit(4);
        }
        for (File i:
                directories
             ) {
            File[] files = i.listFiles();

            for (int j = 0; j < files.length; j++) {
                if (files[j].isFile() && files[j].getName().contains(".java")) {
                    removePackage(files[j]);
                }
            }
        }
    }

    private static void removePackage(File file) throws FileNotFoundException {
        try (
                Scanner input = new Scanner(file);
        ) {
            String removedStr = "package " + file.getParent() + "." + file.getName();
            String str = "";
            String writeStr = "";
            while (input.hasNext()) {
                str = input.nextLine();
                if (str.contains(removedStr)) {
                    continue;
                }
                writeStr += str;
            }
            PrintWriter output = new PrintWriter(file);
            output.println(writeStr);
            output.close();
        }
    }
}
