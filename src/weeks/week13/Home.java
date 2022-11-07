package weeks.week13;

import java.sql.SQLOutput;

public class Home {
    private double squareField;
    private int numberOfBath;
    private int numberOfRoom;
    private boolean isThereGarage;
    private double amountOfSale;
    private double amountOfRent;
    private String front;
    private int year;

    public Home(){
        this(60,1,4,false,100_000,500,"South",2001);
    }
    public Home(double squareField, int numberOfBath, int numberOfRoom, boolean isThereGarage, double amountOfSale, double amountOfRent, String front,int year){
        this.squareField = squareField;
        this.numberOfBath = numberOfBath;
        this.numberOfRoom = numberOfRoom;
        this.isThereGarage = isThereGarage;
        this.amountOfSale = amountOfSale;
        this.amountOfRent = amountOfRent;
        this.front = front;
        this.year = year;
    }

    public double getSquareField() {
        return squareField;
    }

    public void setSquareField(double squareField) {
        this.squareField = squareField;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public boolean isThereGarage() {
        return isThereGarage;
    }

    public void setThereGarage(boolean thereGarage) {
        isThereGarage = thereGarage;
    }

    public double getAmountOfSale() {
        return amountOfSale;
    }

    public void setAmountOfSale(double amountOfSale) {
        this.amountOfSale = amountOfSale;
    }

    public double getAmountOfRent() {
        return amountOfRent;
    }

    public void setAmountOfRent(double amountOfRent) {
        this.amountOfRent = amountOfRent;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print(){
        System.out.println("The square-field of house is " + getSquareField());
        System.out.println("The number of bath is " + getNumberOfBath());
        System.out.println("The number of room is " + getNumberOfRoom());
        System.out.println("Is there any garage " + ((isThereGarage()) ? "Yes" : "No"));
        System.out.println("The sale of house is " + getNumberOfRoom());
        System.out.println("The amount of rent is " + getNumberOfRoom());
        System.out.println("The front of house is " + getFront());
        System.out.println("The year that is builded the house is " + getYear());
    }
}
