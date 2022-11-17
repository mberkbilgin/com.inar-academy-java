package chapters.chapter11.exercises.exercise11_02;

public class Person {
    protected String name;
    protected String address;
    protected String telephoneNumber;
    protected String email;

    public Person(String name, String address, String telephoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Class = Person\nName " + name + "\n";
    }


}
