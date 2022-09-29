package chapters.chapter06.Listings;

public class Listing06_09 {
    public static void main(String[] args) {
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));


         System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));


         System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
         }
    public static int max(int a, int b){
        if(a < b){
            return b;
        }else
            return a;
    }
    public static double max(double a, double b){
        if(a < b){
            return b;
        }else
            return a;
    }
    public static double max(double a, double b, double c){
       return max(max(a,b),c);
    }

}
