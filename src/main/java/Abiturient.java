import documents.*;
import humans.*;
import information.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

public class Abiturient {
    //TODO написать вменяемый конструктор класса (который можно заполнять по частям) пересмотреть лекцию

    public Timestamp registrationTime = new Timestamp(System.currentTimeMillis());
    private static int identificationNumber = 0;

    private Student student;
    private GeoInformation geoInformation;
    private GradeInformation gradeInformation;
    private Privilege privilege;

    private IdentificationDocuments identificationDocuments;
    private GradeDocuments gradeDocuments;
    private MedicalCertificate medicalCertificate;

    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        if (birthDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
