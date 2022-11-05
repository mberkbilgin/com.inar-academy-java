package chapters.chapter08.exercises;

public class Exercise08_03 {

        public static void main(String[] args) {
            char[][] answers = {
                    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

            char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

            int[] m = new int[8];
            for (int i = 0; i < answers.length; i++) {
                int correctCount = 0;
                for (int j = 0; j < answers[i].length; j++) {
                    if(answers[i][j] == keys[j]){
                        correctCount++;
                        m[i] = correctCount;
                    }
                }
            }
            System.out.println("Students in increasing order of the number of correct answers");
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k < m.length; k++) {
                    if(m[k] == j){
                        System.out.println("Student " + (k+1));
                    }
                }

            }
        }
    }


