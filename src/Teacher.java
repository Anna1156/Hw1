public class Teacher {
    String FIO;
    Teacher (String newFIO) {
        FIO = newFIO;
        System.out.println("ФИО преподавателя: " + FIO);
    }

    Student[] students = new Student[3];
    Teacher (Student s1, Student s2, Student s3) {
        for (int i = 0; i < 3; i++) {
            students[1] = s1;
            students[2] = s2;
            students[3] = s3;
            System.out.println();
        }

    }
}

