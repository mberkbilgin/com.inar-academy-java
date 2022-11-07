package chapters.chapter05.exercises;

public class Exercise513 {
    public static void main(String[] args) {
        int i = 0;
        while(Math.pow(i,3)<12000){
            i++;
        }
        System.out.println("The largest number such that n^3 < 12000 is "+(i-1));
    }
}
