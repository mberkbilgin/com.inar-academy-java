package chapters.chapter05.listings;

import java.util.Scanner;

public class Listing511 {
    public static void main(String[] args) {
        String str = "";
        String str1 = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        int dec = input.nextInt();

        while(dec != 0){

            switch (dec % 16 ){
                case 0: str = ""+0; break;
                case 1: str = ""+1; break;
                case 2: str = ""+2; break;
                case 3: str = ""+3; break;
                case 4: str = ""+4; break;
                case 5: str = ""+5; break;
                case 6: str = ""+6; break;
                case 7: str = ""+7; break;
                case 8: str = ""+8; break;
                case 9: str = ""+9; break;
                case 10: str = "A"; break;
                case 11: str = "B"; break;
                case 12: str = "C"; break;
                case 13: str = "D"; break;
                case 14: str = "E";

            }
            str1 = str + str1 ;
            dec /= 16;
        }
        System.out.println("The hex number is "+str1);

    }
}