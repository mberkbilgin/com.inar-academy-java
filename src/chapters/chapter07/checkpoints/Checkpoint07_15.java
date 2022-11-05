package chapters.chapter07.Checkpoints;

import java.util.Arrays;

public class Checkpoint07_15 {
    public static void main(String[] args) {
        int[] list  = {1,2,3,5,4};
        System.out.println("The list is "+Arrays.toString(list));
        reverse(list);
        System.out.println("The reverse for list is "+Arrays.toString(list));
    }
    public static void reverse(int[] arr){
        for (int i = 0, k = arr.length - 1; i < arr.length/2 ; i++, k--) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
