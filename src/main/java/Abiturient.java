import documents.*;
import personalInfo.*;

import java.sql.Timestamp;

public class Abiturient {

    private String login;
    private String password;
    public Timestamp registrationTime = new Timestamp(System.currentTimeMillis());
    private static int insideId = 0;

    private GeoInformation geoInformation;
    private GradeInformation gradeInformation;
    private BioInfo bioInfo;
    private Privilege privilege;

    private IdentificationDocuments identificationDocuments;
    private GradeDocuments gradeDocuments;
    private MedicalSertificate medicalSertificate;

}
