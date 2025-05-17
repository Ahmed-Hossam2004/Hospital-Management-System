package hospital_managment_system;
import hospital_managment_system.DatabaseHandler;

public class TreatmentManager {
    protected int recordNumber;
    protected String treatmentDescription;

    public void addTreatment(int recordNumber, String treatmentDescription) {
        this.recordNumber = recordNumber;
        this.treatmentDescription = treatmentDescription;
    }

    public void displayTreatment(int recordNumber) {
        if (this.recordNumber == recordNumber) {
            System.out.println("Treatment: " + treatmentDescription);
        } else {
            System.out.println("Treatment not found for this record.");
        }
    }

    public void editTreatment(int recordNumber, String newTreatmentDescription) {
        if (this.recordNumber == recordNumber) {
            this.treatmentDescription = newTreatmentDescription;
            System.out.println("Treatment updated.");
        }
    }

    public void deleteTreatment(int recordNumber) {
        if (this.recordNumber == recordNumber) {
            this.treatmentDescription = null;
            System.out.println("Treatment deleted.");
        }
    }
}
