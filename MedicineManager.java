package hospital_managment_system;

import hospital_managment_system.DatabaseHandler;
import java.util.ArrayList;

public class MedicineManager {
    protected int recordNumber;
    protected ArrayList<String> medicineList = new ArrayList<>();

    public void addMedicine(int recordNumber, String medicine) {
        if (this.recordNumber == 0 || this.recordNumber == recordNumber) {
            this.recordNumber = recordNumber;
            medicineList.add(medicine);
        }
    }

    public void displayMedicine(int recordNumber) {
        if (this.recordNumber == recordNumber) {
            for (String medicine : medicineList) {
                System.out.println("- " + medicine);
            }
        }
    }

    public void deleteMedicine(int recordNumber, String medicine) {
        if (this.recordNumber == recordNumber) {
            medicineList.remove(medicine);
        }
    }
}
