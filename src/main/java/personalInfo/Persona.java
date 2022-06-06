package personalInfo;

public class Persona {
    //TODO макет человека, буем от него наследовать абитуриента и его законных представителей
    public String name;
    public String surName;
    public String patronymic;

    private String phoneNumber;

    public Persona(String name, String surName, String patronymic, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
