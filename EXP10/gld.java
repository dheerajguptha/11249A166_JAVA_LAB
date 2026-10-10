
import java.awt.*;
import javax.swing.*;

public class gld extends JFrame {

    public gld() {
        setLayout(new GridLayout(5, 2));

        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        JButton b5 = new JButton("E");
        JButton b6 = new JButton("F");
        JButton b7 = new JButton("G");
        JButton b8 = new JButton("H");
        JButton b9 = new JButton("I");
        JButton b10 = new JButton("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);

        getRootPane().setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        setTitle("GridLayout Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            gld demo = new gld();
            demo.setVisible(true);
        });
    }
}
