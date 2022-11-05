package chapters.chapter08.exercises;

public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        fillTheArr(arr);
        System.out.println("The largest row index: " + numberOfOneForRow(arr));
        System.out.println("The largest column index: " + numberOfOneForColumn(arr));

    }

    public static int numberOfOneForColumn(int[][] arr) {
        int highCount = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == 1) {
                    count++;
                }
            }
            if (count > highCount) {
                highCount = count;
                index = i;
            }
        }
        return index;
    }

    public static int numberOfOneForRow(int[][] arr) {
        int highCount = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > highCount) {
                highCount = count;
                index = i;
            }
        }
        return index;
    }

    public static void fillTheArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
