import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDashboard {

    private String studentUsername;

    public StudentDashboard(String username) {
        this.studentUsername = username;
    }

    public void createStudentUI() {
        JFrame frame = new JFrame("Student Dashboard");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1, 10, 10));

        JButton checkLeaveStatusButton = new JButton("Check Leave Status");
        JButton checkRoomAssignmentButton = new JButton("Check Room Assignment");
        JButton checkFeesStatusButton = new JButton("Check Fees Status");

        checkLeaveStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Check Leave Status functionality.");
            }
        });

        checkRoomAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Check Room Assignment functionality.");
            }
        });

        checkFeesStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Check Fees Status functionality.");
            }
        });

        frame.add(checkLeaveStatusButton);
        frame.add(checkRoomAssignmentButton);
        frame.add(checkFeesStatusButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
