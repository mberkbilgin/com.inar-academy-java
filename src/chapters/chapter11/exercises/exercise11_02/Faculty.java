package chapters.chapter11.exercises.exercise11_02;

import chapters.chapter10.exercises.exercise10_14.MyDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String telephoneNumber, String email, String office, double salary, MyDate hiredDate, String officeHours, String rank) {
        super(name, address, telephoneNumber, email, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }
    public String toString() {
        return "Class = Faculty\nName = " + getName() + "\n";
    }
}
