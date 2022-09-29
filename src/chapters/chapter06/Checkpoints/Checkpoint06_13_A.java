package chapters.chapter06.Checkpoints;

public class Checkpoint06_13_A {
    public static void main(String[] args) {
        int max = 0;
        max(1,2,max);//in method, max changed
        System.out.println(max);//out of method, max became again '0'
    }
    public static void max(int value1, int value2, int max){
        if(value1 > value2){
            max = value1;
        }else
            max = value2;
        System.out.println(max);//should be
    }
}
