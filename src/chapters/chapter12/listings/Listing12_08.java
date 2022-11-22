package chapters.chapter12.listings;

import chapters.chapter12.listings.listing12_07.CircleWithException;

public class Listing12_08 {
    public static void main(String[] args) {
        try{
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}
