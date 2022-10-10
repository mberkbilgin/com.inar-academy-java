package chapters.chapter07.Listings;

public class Listing07_03 {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println("Before invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        reelSwap(a);
        System.out.println("After invoking reelSwap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
    }
    public static void swap(int i1, int i2){
        int temp = i1;
        i1 = i2;
        i2 = temp;
    }
    public static void reelSwap(int[] arr ){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
