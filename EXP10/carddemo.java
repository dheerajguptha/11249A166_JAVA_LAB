
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class carddemo extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JPanel buttonPanel;
    CardLayout buttonCardLayout;

    public carddemo() {
        buttonPanel = new JPanel();

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new JButton("First Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first");

        b2 = new JButton("Second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second");

        b3 = new JButton("Third Button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third");

        add(buttonPanel);

        setTitle("CardLayout Demo");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            carddemo demo = new carddemo();
            demo.setVisible(true);
        });
    }
}
