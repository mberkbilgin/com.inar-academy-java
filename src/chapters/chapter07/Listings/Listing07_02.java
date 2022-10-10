package chapters.chapter07.Listings;

import java.util.Arrays;

public class Listing07_02 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        System.out.println("Before the shuffle\n"+Arrays.toString(deck));
        swap(deck);
        System.out.println("After the shuffle\n"+Arrays.toString(deck));
        pickFourCards(deck);
    }

    public static void pickFourCards(int[] arr) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Card number "+numberAndName(arr[(int)(Math.random()* arr.length)]));
        }
    }

    public static String numberAndName(int i) {
        String[] name = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] number = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String str = i +": "+ number[i % 13] +" "+ name[i / 13];
        return str;
    }

    public static void swap(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int k = (int)(Math.random()* arr.length);
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }

}
