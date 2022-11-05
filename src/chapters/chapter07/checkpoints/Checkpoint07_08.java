package chapters.chapter07.checkpoints;

public class Checkpoint07_08 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        arr[arr.length-1] = 5.5;
        double sum = arr[0] + arr[1];
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

    }
}
