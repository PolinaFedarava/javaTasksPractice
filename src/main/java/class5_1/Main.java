package class5_1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Алина", "Иванова", "Физика");
        Student student2 = new Student("Олег", "Петров", "Математика");
        Employee employee1 = new Employee("Полина", "Полина", 2000);

        Desk<Integer, Person> desk1 = new Desk<>(1, student1);
        Desk<Integer, Person> desk2 = new Desk<>(2, student2);
        Desk<Integer, Person> desk3 = new Desk<>(3, employee1);

        desk1.printPersonName();
        desk2.printPersonName();
        desk3.printPersonName();
    }

}
