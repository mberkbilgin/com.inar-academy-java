package chapters.chapter05.exercises;

public class Exercise510 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000 ; i++) {
            if(i % 5 == 0 && i % 6 == 0){
                count++;
                if (count % 10 !=0){
                    System.out.print(i+" ");
                }else{
                    System.out.println(i);
                }

            }
        }
    }
}
