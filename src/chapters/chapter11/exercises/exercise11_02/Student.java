package chapters.chapter11.exercises.exercise11_02;

public class Student extends Person{
    public static final int  FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;
    private int classStatus;

    public Student(String name, String address, String telephoneNumber, String email, int classStatus) {
        super(name, address, telephoneNumber, email);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }
    public String toString(){
        return "Class = Student\nName = " + getName() + "\n";
    }
}
