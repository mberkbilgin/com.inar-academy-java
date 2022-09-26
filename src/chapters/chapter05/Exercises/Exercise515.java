package chapters.chapter05.Exercises;

public class Exercise515 {
    public static void main(String[] args) {
        char ch ;
        int count = 0;
        for (int i = 33; i <= 126; i++) {
            ch = (char)i;
            count++;
            if(count % 10 == 0){
                System.out.println(ch);
            }else
                System.out.print(ch+" ");

        }


    }
}
