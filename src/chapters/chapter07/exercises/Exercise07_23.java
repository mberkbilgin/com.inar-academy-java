package chapters.chapter07.exercises;

public class Exercise07_23 {
    public static void main(String[] args) {
        int[] locker = new int[100];
        locker[0] = 1;
        for (int k = 2; k < locker.length; k++) {
            for (int i = k; i < locker.length; i += k + 1) {                if (locker[i] == 0) {
                    locker[i] = 1;
                } else {
                    locker[i] = 0;
                }
            }
        }
        int count = 1;
        System.out.println("Open locker is ");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i] == 1) {
                if(count % 10 == 0){
                    System.out.println(i+1);
                    count++;
                }else{
                    System.out.print((i+1) + " ");
                    count++;
                }


            }
        }

    }
}
