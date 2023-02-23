public class University {
    String FIO1;
    String FIO2;
    String FIO3;
    University (String newFIO1, String newFIO2, String newFIO3) {
        FIO1 = newFIO1;
        FIO2 = newFIO2;
        FIO3 = newFIO3;
        System.out.println("ФИО 1 преподавателя: " + FIO1 + ";" + "ФИО 2 преподавателя: " + FIO2 + ";" +"ФИО 3 преподавателя: " + FIO3);
        FIO1 = newFIO1;
        System.out.println("1. Профессионально-педагогическое образование.");
        FIO2 = newFIO2;
        System.out.println("2. Инженерно-педагогическое образование.");
        FIO3 = newFIO3;
        System.out.println("3. Профессионально-педагогическое образование.");
    }
}

