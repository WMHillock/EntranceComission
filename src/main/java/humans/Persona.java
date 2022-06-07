package humans;

public abstract class Persona {
    //TODO вопрос нужен ли этот абстрактный класс, он родитель всего для 2 классов?
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

    @Override
    public String toString() {
        return String.format("%s %s %s, Тел.: %s",
                surName,
                name,
                patronymic,
                phoneNumber);
    }
}

