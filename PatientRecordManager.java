package hospital_managment_system;
import hospital_managment_system.DatabaseHandler;
import java.util.ArrayList;

public class PatientRecordManager {
    protected String name;
    protected String address;
    protected int age;
    protected char gender;
    protected String diseaseDescription;
    protected int specialistRoomNumber;

    private static ArrayList<PatientRecordManager> patientRecords = new ArrayList<>();

    public void addNewPatientRecord(String name, String address, int age, char sex, String diseaseDescription, int specialistRoomNumber) {
        PatientRecordManager patient = new PatientRecordManager();
        patient.name = name;
        patient.address = address;
        patient.age = age;
        patient.gender = gender;
        patient.diseaseDescription = diseaseDescription;
        patient.specialistRoomNumber = specialistRoomNumber;
        patientRecords.add(patient);
    }

    public static PatientRecordManager searchPatientRecord(String fullName) {
        for (PatientRecordManager record : patientRecords) {
            if (record.name.equalsIgnoreCase(fullName)) {
                return record;
            }
        }
        return null;
    }

    public static String listPatientRecords() {
    StringBuilder sb = new StringBuilder();
    for (PatientRecordManager record : patientRecords) {
        sb.append("Name: ").append(record.name).append("\n");
        sb.append("Address: ").append(record.address).append("\n");
        sb.append("Age: ").append(record.age).append("\n");
        sb.append("Gender: ").append(record.gender).append("\n");
        sb.append("Disease: ").append(record.diseaseDescription).append("\n");
        sb.append("Specialist Room: ").append(record.specialistRoomNumber).append("\n\n");
    }
    if (sb.isEmpty()) {
        return "No patients found.";
    }
    return sb.toString();
}


    public static void deletePatientRecord(String fullName) {
        PatientRecordManager patient = searchPatientRecord(fullName);
        if (patient != null) {
            patientRecords.remove(patient);
            System.out.println("Patient record deleted successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }
}
