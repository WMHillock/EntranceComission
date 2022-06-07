import humans.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //TODO Отсель начинаются владенья графа ctrl+c и его вассала ctrl+v
        LocalDate birthday = LocalDate.of(1989, 7, 4);
        System.out.println(Abiturient.calculateAge(birthday));
        Student alph = new Student("Vasiliy", "Bykov", "Vitalyevich", "+79500204605", LocalDate.of(1989, 7, 4), "Leningrad");
        System.out.println(alph);
    }
}
