package chapters.chapter05.listings;

public class Listing058 {
    public static void main(String[] args) {
        float sum = 0;

        for(float i = 0.01f; i <= 1.0f; i += 0.01f){
            sum += i;
        }
        System.out.println(sum);
    }
}
