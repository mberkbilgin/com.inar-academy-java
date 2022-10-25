package chapters.chapter08.Exercises;

public class Exercise08_22 {
    public static void main(String[] args) {
        int[][] m = new int[6][6];
        fillTheArr(m);
        display(m);
        if ((evenNumberOfOne(m))) {
            System.out.println("Every row and every column have an even number of 1s ");
        } else {
            System.out.println("Every row and every column have not an even number of 1s ");
        }

    }

    public static boolean evenNumberOfOne(int[][] m) {
        if (evenNumberForRow(m) && evenNumberForColumn(m)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean evenNumberForColumn(int[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            int count = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] == 1) {
                    count++;
                }
            }
            if (count != 0 && count != 2 && count != 4 && count != 6) {
                return false;
            }
        }
        return true;
    }

    public static boolean evenNumberForRow(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
            }
            if (count != 0 && count != 2 && count != 4 && count != 6) {
                return false;
            }
        }
        return true;
    }

    public static void display(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTheArr(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 2);
            }
        }
    }


}
