package documents;

public class AnotherDocuments {

    private String snils;
    private String inn;

    public AnotherDocuments(String snils, String inn) {
        this.snils = snils;
        this.inn = inn;
    }

    /*TODO у нас получается под видом снилса можно и инн ввести, а создавать отдельно сущность инн и снилс
        как то странно получится 2 сущности с 1 параметром, хотя может так и правильней будет
    */
    public AnotherDocuments(String snils) {
        this.snils = snils;
    }
}
