package chapters.chapter06.Listings;

public class Listing06_01 {
    public static void main(String[] args) {
        int i = 7;
        int j = 5;
        int k = max(i,j);
        System.out.println("The maxium of "+i+" and "+j+" is "+k);
    }
    public static int max(int i1, int i2){
        int result = 0;
        if(i1 < i2){
            result = i2;
        }else if (i2 < i1){
            result = i1;
        }
        return  result ;
    }
}
