package chapters.chapter06.Listings;

public class Listing06_04 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before call to the method, x is "+x);
        increment(x);
        System.out.println("After call to the method, x is "+x);
    }
    public static void increment(int x){
        x++;
        System.out.println("x inside the method is "+x);
    }
}
