package chapters.chapter10.exercises.exercise10_09;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("InarAcademy");
        course1.addStudent("Hulusi");
        course1.addStudent("Haluk");
        course1.addStudent("Dündar");
        course1.dropStudent("Dündar");
        System.out.println("Name of course is " + course1.getCourseName());
        System.out.println("Number of student is " + course1.getNumberOfStudents());
        System.out.println("\nSTUDENTS");
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null)
            System.out.println(students[i]);
        }
    }
}
