package chapters.chapter12.exercises.exercise12_01;

public class Exercise12_01B {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculator operand1 operator operand2");
            System.exit(0);
        }
        if (!isNumber(args[0])) {
            System.out.println("Invalid input : " + args[0]);
            System.exit(0);
        }
        if (!isNumber(args[2])) {
            System.out.println("Invalid input : " + args[2]);
            System.exit(0);
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
        System.out.println(n1 + " " + args[1] + " " + n2 + "=" + result);

    }

    public static boolean isNumber(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            if(arg.charAt(i) > 9 && arg.charAt(i) > 0){
                return false;
            }
        }
        return true;
    }
}
