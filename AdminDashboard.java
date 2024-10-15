import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard {

    public void createAdminUI() {
        JFrame frame = new JFrame("Admin Dashboard");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        JButton addStudentButton = new JButton("Add Student");
        JButton removeStudentButton = new JButton("Remove Student");
        JButton approveLeaveButton = new JButton("Approve Leave");
        JButton assignRoomButton = new JButton("Assign Room");
        JButton viewFeesButton = new JButton("View Fees Status");

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Add Student functionality.");
            }
        });

        removeStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Remove Student functionality.");
            }
        });

        approveLeaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Approve Leave functionality.");
            }
        });

        assignRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Assign Room functionality.");
            }
        });

        viewFeesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "View Fees Status functionality.");
            }
        });

        frame.add(addStudentButton);
        frame.add(removeStudentButton);
        frame.add(approveLeaveButton);
        frame.add(assignRoomButton);
        frame.add(viewFeesButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
