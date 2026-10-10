
import java.awt.*;
import javax.swing.*;

public class insertdemo extends JFrame {

    public insertdemo() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new JButton("This is across the top"), BorderLayout.NORTH);
        add(new JButton("The footer message might go here"), BorderLayout.SOUTH);
        add(new JButton("RIGHT"), BorderLayout.EAST);
        add(new JButton("LEFT"), BorderLayout.WEST);

        String msg = "The reasonable man adapts\n\n";
        add(new JTextArea(msg), BorderLayout.CENTER);

        getRootPane().setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        setTitle("Insert Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            insertdemo demo = new insertdemo();
            demo.setVisible(true);
        });
    }
}
