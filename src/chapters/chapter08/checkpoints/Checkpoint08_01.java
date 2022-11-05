package chapters.chapter08.checkpoints;

public class Checkpoint08_01 {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[4][5];
        fillArr(twoDimensionalArray);

    }

    public static void fillArr(int[][] twoDimensionalArray) {
        for (int i = 0; i <twoDimensionalArray.length ; i++) {
            for (int j = 0; j <twoDimensionalArray[i].length ; j++) {
                twoDimensionalArray[i][j] = (int)(Math.random()*10);
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
