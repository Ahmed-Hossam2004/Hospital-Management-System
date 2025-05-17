package hospital_managment_system;
import hospital_managment_system.DatabaseHandler;


public class FinancialRecordManager {
    protected double totalCharge;
    protected double totalDeposited;
    protected double totalMoneyToReturn;

    public FinancialRecordManager(double totalCharge, double totalDeposited) {
        this.totalCharge = totalCharge;
        this.totalDeposited = totalDeposited;
        this.totalMoneyToReturn = totalDeposited - totalCharge;
    }

    public void displayFinancialRecords() {
        System.out.println("Total Charge: " + totalCharge);
        System.out.println("Total Deposited: " + totalDeposited);
        System.out.println("Total Money to Return: " + totalMoneyToReturn);
    }
}
