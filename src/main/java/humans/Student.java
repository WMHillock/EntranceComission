package humans;

import java.time.LocalDate;

public class Student extends Persona {

    private LocalDate birthDate;
    private String birthPlace;

    public Student(String name, String surName, String patronymic, String phoneNumber, LocalDate birthDate, String birthPlace) {
        super(name, surName, patronymic, phoneNumber);
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
    }
}
