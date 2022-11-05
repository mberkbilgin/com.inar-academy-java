package chapters.chapter09.exercises;

public class Exercise09_08_Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Exercise09_08_Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    Exercise09_08_Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        if (on) {
            String str = "Fan's speed is " + getSpeed() + "\nColor is " + getColor() + "\nRadius is " + getRadius();
            return str;
        } else {
            String str = "Fan is off\nFan's color is " + getColor() + "\nRadius is " + getRadius();
            return str;
        }
    }

    public static void main(String[] args) {
        Exercise09_08_Fan fan1 = new Exercise09_08_Fan(3, true, 10, "yellow");
        Exercise09_08_Fan fan2 = new Exercise09_08_Fan(2, false, 5, "blue");
        System.out.println("Fan-1");
        System.out.println(fan1.toString());
        System.out.println("-------------------------");
        System.out.println("Fan-2");
        System.out.println(fan2.toString());
    }
}
