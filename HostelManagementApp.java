import javax.swing.SwingUtilities;

public class HostelManagementApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginUI loginUI = new LoginUI();
            loginUI.createLoginUI();
        });
    }
}
