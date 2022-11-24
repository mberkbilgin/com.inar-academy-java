package chapters.chapter12.exercises.exercise12_01;

public class Exercise12_01A {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculator operand1 operator operand2");
            System.exit(0);
        }
        try {
            Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input : " + args[0]);
            System.exit(1);
        }
        try {
            Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input : " + args[2]);
            System.exit(1);
        }
        Integer n1 = Integer.parseInt(args[0]);
        Integer n2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '.':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
        }

        System.out.println(n1 + " " + args[1] + " " + n2 + " = " + result);

    }
}
