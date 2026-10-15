import java.awt.*;
import javax.swing.*;

public class HumanFaceUsingApplet extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw face
        g.drawOval(40, 40, 120, 150);

        // Draw eyes
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        // Draw pupils
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        // Draw nose
        g.drawOval(85, 100, 30, 30);

        // Draw mouth
        g.drawArc(60, 125, 80, 40, 180, 180);

        // Draw ears
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFaceUsingApplet face = new HumanFaceUsingApplet();

        frame.add(face);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}