import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Дубков", 5); //1 часть задания
        student.marks();
        student.correction();
        Teacher FIO = new Teacher("Крылов А.В."); // 2 часть задания
        Student s1 = new Student("Волков",5);
        Student s2 = new Student("Белов",3);
        Student s3 = new Student("Орлов",4);
        Teacher[] teacher;
        teacher = new Teacher[3];
        University university = new University("Лесов Д.А.", "Кавалев М.В.", "Чириков А.Г."); //3 часть задания

    }
}
