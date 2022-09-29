package chapters.chapter06.Listings;

public class Listing06_05 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before invoking the swap method num1 is "+num1+" and num2 is "+num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method num1 is "+num1+" and num2 is "+num2);
    }
    public static void swap(int i, int k){
        System.out.println("\tInside the swap method");
         System.out.println("\t\tBefore swapping, num1 is " + i
                 + " and num2 is " + k);
        int temp = i;
        i = k ;
        k = temp;
        System.out.println("\t\tAfter swapping, num1 is " + i
                + " and num2 is " + k);

    }
}
