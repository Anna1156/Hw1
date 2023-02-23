public class Student {
    String surname;
    String subject;
    private int mark;

    void setMark(int newMark) {
        if ( newMark > 1 && newMark < 6) {
            mark = newMark;
        } else {
            System.out.println("Incorrect mark");
        }
    }
    int getMark() {
        return mark;
    }
    Student () {
        subject = "Сomputer science";
        System.out.println("Subject" + subject);
    }

    Student(String newSurname, int newMark) {
        surname = newSurname;
        mark = newMark;
        System.out.println("Данные студента: " + surname + "," + " оценка:" + mark);
    }

    int marks() {
        if (mark == 5) {
            System.out.println("Высшая оценка");
        } else {
            mark++;
            System.out.println("Я исправил оценку на " + mark);
        }
        return mark;
    }

    int correction() {
        if (mark == 5) {
            System.out.println("Теперь я отличник:D");
        }
        if (mark == 4) {
            System.out.println("Теперь я хорошист:)");
        }
        if ( mark < 4){
            System.out.println("Теперь я троечник:|");
        }
        return mark;
    }
}
