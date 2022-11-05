package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int number = input.nextInt();
        int[][] m = new int[number][2];
        System.out.println("Enter the numbers of array");
        fillTheArr(m);
        System.out.println("Before the sort ");
        display(m);
        sort(m);
        System.out.println("After the sort ");
        display(m);

    }

    public static void display(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sort(int m[][]){
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if(m[i][0] > m[j][0]){
                    int temp = m[i][0];
                    m[i][0] = m[j][0];
                    m[j][0] = temp;
                }
            }
        }
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if(m[i][0] == m[j][0]){
                    if(m[i][1] > m[j][1]){
                        int temp = m[i][1];
                        m[i][1] = m[j][1];
                        m[j][1] = temp;

                    }
                }
            }
        }
    }

    public static void fillTheArr(int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }

        }
    }
}
