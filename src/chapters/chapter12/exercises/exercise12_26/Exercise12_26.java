package chapters.chapter12.exercises.exercise12_26;

import java.io.File;

public class Exercise12_26 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_26 fileName");
            System.exit(0);
        }
        File directory = new File(args[0]);
        if (directory.exists()) {
            System.out.println("Directory already exists");
            System.exit(1);
        }else{
            directory.mkdirs();
            System.out.println("“Directory created successfully");
        }
    }
}
