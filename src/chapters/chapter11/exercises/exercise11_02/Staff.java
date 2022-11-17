package chapters.chapter11.exercises.exercise11_02;

import chapters.chapter10.exercises.exercise10_14.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String telephoneNumber, String email, String office, double salary, MyDate hiredDate, String title) {
        super(name, address, telephoneNumber, email, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String toString() {
        return "Class = Staff\nName = " + getName() + "\n";
    }
}

