package chapters.chapter11.exercises.exercise11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int number = input.nextInt();
        int[][] arr = new int[number][number];
        fillTheArr(arr);
        display(arr);
        ArrayList<Integer> row = new ArrayList<>(number);
        ArrayList<Integer> col = new ArrayList<>(number);
        largestRowAndColumn(arr,row,col);
        System.out.println("The largest row index is " + maxRow(row));
        System.out.println("The largest column index is " + maxCol(col));


    }

    public static int maxCol(ArrayList<Integer> col) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < col.size(); i++) {
            if(col.get(i) > max){
                max = col.get(i);
                index = i;
            }
        }
        return index;
    }

    public static int maxRow(ArrayList<Integer> row) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < row.size(); i++) {
            if(row.get(i) > max){
                max = row.get(i);
                index = i;
            }
        }
        return index;
    }

    public static void largestRowAndColumn(int[][] arr, ArrayList<Integer> row, ArrayList<Integer> col) {
        for (int i = 0; i < arr.length; i++) {
            int number = 0;
            for (int j = 0; j < arr[i].length; j++) {
                number += arr[i][j];
            }
            row.add(i,number);
        }
        for (int i = 0; i < arr[0].length; i++) {
            int number = 0;
            for (int j = 0; j < arr.length; j++) {
                number += arr[j][i];
            }
            col.add(i,number);
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTheArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 2);
            }
        }
    }
}
