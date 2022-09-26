package chapters.chapter05.Exercises;

public class Exercise518 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern B");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern C");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6-i; j++) {
                System.out.print("  ");
            }
            for (int k = i+1; k >= 1; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern D");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 6-i ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
            
        }
    }
}
