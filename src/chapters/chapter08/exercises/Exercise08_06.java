package chapters.chapter08.exercises;

public class Exercise08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] multi = new double[3][3];
        System.out.println("Enter numbers for matrix-1:");
        Exercise08_05.fillTheArr(matrix1);
        System.out.println("Enter numbers for matrix-2:");
        Exercise08_05.fillTheArr(matrix2);
        multiplication(matrix1,matrix2,multi);
        System.out.println("The multiplication of the matrices is");
        displayArr(matrix1,matrix2,multi);
    }

    public static void multiplication(double[][] matrix1, double[][] matrix2, double[][] multi) {
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] + matrix1[i][2] * matrix2[2][j] ;
            }
        }
    }
    public static void displayArr(double[][] matrix1, double[][] matrix2, double[][] sumMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                System.out.printf("%2.1f ", matrix1[i][k]);
                if (i == 1 && k == 2) {
                    System.out.printf("%2s ", " * ");
                } else {
                    System.out.printf("%3s ", " ");
                }

            }
            for (int k = 0; k < matrix2[i].length; k++) {
                System.out.printf("%2.1f ", matrix2[i][k]);
                if (i == 1 && k == 2) {
                    System.out.printf("%2s ", " = ");
                } else {
                    System.out.printf("%3s ", " ");
                }


            }
            for (int k = 0; k < sumMatrix[i].length; k++) {
                System.out.printf("%5.1f ", sumMatrix[i][k]);
            }
            System.out.println("");
        }
    }
}
