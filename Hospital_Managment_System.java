
package hospital_managment_system;

import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Hospital_Managment_System {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HosGUITest().setVisible(true);
        });
    }
}
