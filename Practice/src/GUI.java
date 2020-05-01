import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    // Properties
    private int count = 0;
    private JLabel clickLabel;
    private JFrame frame;
    private JPanel panel;

    // GUI method.
    public GUI() {

        // Create JFrame objects
        frame = new JFrame();
        panel = new JPanel();

        // Create UI elements
        JButton countButton = new JButton("Click on me!!!");
        countButton.addActionListener(this);
        clickLabel = new JLabel("Number of clicks: 0");

        // Setup the panel
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(countButton);
        panel.add(clickLabel);

        // Setup the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);


    }

    // Main method for running
    public static void main(String[] args) {
        new GUI();
    }

    // THis is for actions, in this case for the button.
    @Override
    public void actionPerformed(ActionEvent e) {

        // Increment the count per click.
        count ++;

        // Update the label
        clickLabel.setText("Number of clicks: " + count);

    }
}
