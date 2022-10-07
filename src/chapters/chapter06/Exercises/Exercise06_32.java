package chapters.chapter06.Exercises;

public class Exercise06_32 {
    public static void main(String[] args) {
        int count = 0;
        int i = (int)(Math.random()*7);
        int k = (int)(Math.random()*7);
        for (int j = 0; j < 10000; j++) {
            if(isWin(i,k)){
                count++;
            }
        }
        System.out.println("\nNumber of winning game is "+count);
    }

    public static boolean isWin(int i, int k) {
        System.out.println("You rolled "+i+" + "+k+" = "+(i+k));
        if (i+k == 2 || i+k == 3 || i+k == 12 ){
            System.out.println("You lose");
            return false;
        }else if (i+k == 7 || i+k == 11){
            System.out.println("You win");
            return true;
        }else {
            System.out.println("Point is "+(i+k));
            int old =i+k;
            do{
                i = (int)(Math.random()*7);
                k = (int)(Math.random()*7);
            }while(old != i+k && i+k != 7);
            System.out.println("You rolled "+i+" + "+k+" = "+(i+k));
            if(old == i + k){
                System.out.println("You win");
                return true;
            }else
                System.out.println("You lose");
            return false;
        }

    }


    
}
