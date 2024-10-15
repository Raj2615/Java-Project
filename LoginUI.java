import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI {

    public void createLoginUI() {
        JFrame frame = new JFrame("Hostel Management - Login");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Username label and input
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameInput = new JTextField();
        
        // Password label and input
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordInput = new JPasswordField();

        // Role dropdown label and input
        JLabel roleLabel = new JLabel("Role:");
        String[] roles = {"Admin", "Student"};
        JComboBox<String> roleDropdown = new JComboBox<>(roles);

        // Login button
        JButton loginButton = new JButton("Login");

        // Sign-Up button
        JButton signUpButton = new JButton("Sign Up");

        // Add functionality to the Login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText();
                String password = new String(passwordInput.getPassword());
                String role = (String) roleDropdown.getSelectedItem();
                
                if (login(username, password, role)) {
                    if (role.equals("Admin")) {
                        frame.dispose();  // Close the login window
                        AdminDashboard adminDashboard = new AdminDashboard();
                        adminDashboard.createAdminUI();  // Open the Admin Dashboard
                    } else {
                        frame.dispose();  // Close the login window
                        StudentDashboard studentDashboard = new StudentDashboard(username);
                        studentDashboard.createStudentUI();  // Open the Student Dashboard
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Failed. Invalid credentials.");
                }
            }
        });

        // Add functionality to the Sign-Up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();  // Close the login window
                SignUpUI signUpUI = new SignUpUI();
                signUpUI.createSignUpUI();  // Open the Sign-Up window
            }
        });

        // Add components to the frame
        frame.add(usernameLabel);
        frame.add(usernameInput);
        frame.add(passwordLabel);
        frame.add(passwordInput);
        frame.add(roleLabel);
        frame.add(roleDropdown);
        frame.add(loginButton);
        frame.add(signUpButton);  // Add Sign-Up button

        // Center the frame on the screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Mock login method (You can later connect this to a database)
    private boolean login(String username, String password, String role) {
        if (role.equals("Admin")) {
            return username.equals("admin") && password.equals("admin");
        } else if (role.equals("Student")) {
            return SignUpUI.userData.containsKey(username) && SignUpUI.userData.get(username).equals(password);
        }
        return false;
    }

    public static void main(String[] args) {
        // Launch the login UI
        SwingUtilities.invokeLater(() -> {
            LoginUI loginUI = new LoginUI();
            loginUI.createLoginUI();
        });
    }
}
