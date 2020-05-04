import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    // Properties
    private static JLabel userLabel;
    private static  JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static  JButton loginButton;
    private static JLabel success;

    public static void main(String[] args) {

        // Panel is basically the layout
        JPanel  panel = new JPanel();

        // Frame is the window
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        // Add the user label.
        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Text field.
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Paswword Label
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        // Password text field
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Add the button
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);

        // Success Label
        success = new JLabel("");
        success.setBounds(10,110, 300, 25);
        panel.add(success);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String password = passwordText.getText(); // Will need to update

        // For testing
        System.out.println(user + ", " + password);

        // TODO clear the text after an attempt

        // Check if password is correct.
        if(user.equals("Lucas") && password.equals("Dahls")) {
            success.setText("Login Successful");

        } else {
            success.setText(("Try again..."));
        }

    }

}
