package class5_1;

public class Student extends Person{
    String faculty;

    public Student(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }
}
