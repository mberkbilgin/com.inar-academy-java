package weeks.week07;

import java.util.Scanner;

public class isUniqueCharacters {
    public static void main(String[] args) {

        System.out.println("Enter a line: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        if(isUnique(str)){
            System.out.println(str+" is unique");
        }else
            System.out.println(str+" is not unique");
    }
    public static boolean isUnique(String str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }

        }
        return true;
    }
}
