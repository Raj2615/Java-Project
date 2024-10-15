import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class SignUpUI {
    // Storing user data temporarily for demo purposes (you can later connect this to a DB)
    private static Map<String, String> userData = new HashMap<>();

    public void createSignUpUI() {
        JFrame frame = new JFrame("Hostel Management - Sign Up");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameInput = new JTextField();
        
        // Password
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordInput = new JPasswordField();
        
        // Confirm Password
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordInput = new JPasswordField();

        // Sign-Up Button
        JButton signUpButton = new JButton("Sign Up");

        // Sign-Up Button Action
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText();
                String password = new String(passwordInput.getPassword());
                String confirmPassword = new String(confirmPasswordInput.getPassword());

                if (password.equals(confirmPassword)) {
                    if (userData.containsKey(username)) {
                        JOptionPane.showMessageDialog(frame, "Username already exists. Please choose another one.");
                    } else {
                        userData.put(username, password);  // Save user data (for demo)
                        JOptionPane.showMessageDialog(frame, "Sign Up successful! You can now log in.");
                        frame.dispose();  // Close sign-up window
                        LoginUI loginUI = new LoginUI();
                        loginUI.createLoginUI();  // Return to login screen
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match. Please try again.");
                }
            }
        });

        // Add components to frame
        frame.add(usernameLabel);
        frame.add(usernameInput);
        frame.add(passwordLabel);
        frame.add(passwordInput);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordInput);
        frame.add(signUpButton);

        frame.setLocationRelativeTo(null);  // Center the frame
        frame.setVisible(true);
    }
}
