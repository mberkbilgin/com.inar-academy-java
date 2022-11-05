package chapters.chapter08.exercises;

import java.util.Scanner;


public class Exercise08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int number = input.nextInt();
        String[] m = new String[number];
        System.out.println("Enter " + number + " rows of letters by spaced:");
        int count = 0;
        while (count < m.length) {
            if (isTrueScale(m, count)) {
                if (isTrueRow(m, count)) {
                    if (count > 0) {
                        if (!isTrueColumn(m, count)) {
                            System.out.println("Each letters in the column should be different");

                        }
                    }
                } else {
                    System.out.println("Each letters in the row should be different");
                    System.exit(-1);
                }

            } else {
                System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + m.length - 1));
                System.exit(-1);

            }
            count++;
        }
        System.out.println("The input array is a Latin square");

    }

    public static boolean isTrueColumn(String[] m, int count) {
        for (int i = 0; i < m[0].length(); i += 2) {
            for (int j = 0; j <= count - 1; j++) {
                for (int k = j + 1; k <= count; k++) {
                    if (m[j].charAt(i) == m[k].charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isTrueRow(String[] m, int count) {
        for (int j = 0; j < m[0].length() - 1; j += 2) {
            for (int k = j + 2; k < m[0].length(); k += 2) {
                if (m[count].charAt(j) == m[count].charAt(k)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isTrueScale(String[] m, int count) {
        Scanner input = new Scanner(System.in);
        m[count] = input.nextLine();
        for (int i = 0; i < m[0].length(); i += 2) {
            if ((char) 'A' > m[count].charAt(i) || m[count].charAt(i) > (char) ('A' + m.length - 1)) {
                return false;
            }
        }
        return true;
    }


}
