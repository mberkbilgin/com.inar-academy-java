package weeks.week14;

public class Bus extends Vehicles{
    private int passengerSeat;

    public Bus() {
        super();
    }

    public Bus(String brand, String model, int wheels, int year, String color, boolean hasSunRoof, boolean hasInsurance, boolean running, int passengerSeat) {
        super(brand, model, wheels, year, color, hasSunRoof, hasInsurance, running);
        this.passengerSeat = passengerSeat;
    }
    public void accelarate(){
        System.out.println((isRunning())?"Bus is getting faster":"Your cas is not running");
    }
    public void slowDown(){
        System.out.println((isRunning())?"Bus is getting slower":"Your cas is not running");
    }

}
