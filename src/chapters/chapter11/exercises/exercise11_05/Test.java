package chapters.chapter11.exercises.exercise11_05;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("Inar");
        System.out.println("Course's name is " +c1.getCourseName());
        c1.addStudent("Haluk");
        c1.addStudent("Ahmet");
        c1.addStudent("Mehmet");
        String[] students = c1.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Number of students is " + c1.getNumberOfStudents());
        //1.dropStudent("AHMET");
        c1.dropStudent("Ahmet");
        students = c1.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Number of students is " + c1.getNumberOfStudents());

    }
}
