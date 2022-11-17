package chapters.chapter11.exercises.exercise11_02;

import chapters.chapter10.exercises.exercise10_14.MyDate;
import chapters.chapter11.exercises.exercise11_02.Person;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate hiredDate;

    public Employee(String name, String address, String telephoneNumber, String email, String office, double salary, MyDate hiredDate) {
        super(name, address, telephoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }
    public String toString(){
        return "Class = Employee\nName = " + getName() + "\n";
    }
}
