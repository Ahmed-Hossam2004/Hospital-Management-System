package hospital_managment_system;

import java.sql.*;

public class DatabaseHandler {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","" );
            return conn;
        }
        catch(Exception e){
            return null;
        }
    }
    public static String getPatientNameById(int id) {
    String name = null;
    String sql = "SELECT Name FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            name = rs.getString("Name"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return name;
}
    public static int getPatientAgeById(int id) {
    int age = 0;
    String sql = "SELECT Age FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            age = rs.getInt("Age"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return age;
}
    public static int getPatientRoomById(int id) {
    int room = 0;
    String sql = "SELECT Room FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            room = rs.getInt("Room"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return room;
}
    
    public static String getPatientGenderById(int id) {
    String gender = null;
    String sql = "SELECT Gender FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            gender = rs.getString("Gender"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return gender;
}
    
    public static String getPatientAddressById(int id) {
    String address = null;
    String sql = "SELECT Address FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            address = rs.getString("Address"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return address;
}
    
    public static String getPatientDiseaseById(int id) {
    String disease = null;
    String sql = "SELECT Disease FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            disease = rs.getString("Disease"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return disease;
}
    public static String getPatientTreatmentById(int id) {
    String treatment = null;
    String sql = "SELECT Treatment FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            treatment = rs.getString("Treatment"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return treatment;
}
    public static String getPatientMedicineById(int id) {
    String medicine = null;
    String sql = "SELECT Medicine FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            medicine = rs.getString("Medicine"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return medicine;
}
    
    public static double getPatientTotalChargeById(int id) {
    double charge = 0.0;
    String sql = "SELECT TotalCharge FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            charge = rs.getDouble("TotalCharge"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return charge;
}
    
    public static double getPatientTotalDepositedById(int id) {
    double paid = 0.0;
    String sql = "SELECT TotalDeposited FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            paid = rs.getDouble("TotalDeposited"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return paid;
}
    
    public static double getPatientMoneyToReturnById(int id) {
    double money = 0.0;
    String sql = "SELECT MoneyToReturn FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id); // set the ID you're searching for
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            money = rs.getDouble("MoneyToReturn"); // get the Name column
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return money;
}
    
    public static boolean deletePatientById(int id) {
    String sql = "DELETE FROM hospitalmanagmentsystem WHERE ID = ?";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);          // put the ID in the placeholder
        int rows = stmt.executeUpdate();

        return rows > 0;             // true = something was deleted

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    public static int getLastPatientId() {
    int lastId = -1;
    String sql = "SELECT ID FROM hospitalmanagmentsystem ORDER BY ID DESC LIMIT 1";

    try (Connection conn = DatabaseHandler.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            lastId = rs.getInt("ID");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lastId;
}
}
