import java.awt.*;
import javax.swing.*;

public class LineAndRectangleUsingApplet extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line
        g.drawLine(10, 10, 50, 50);

        // Draw a rectangle
        g.drawRect(10, 60, 40, 30);

        // Fill a rectangle
        g.fillRect(60, 10, 30, 80);

        // Draw a rounded rectangle
        g.drawRoundRect(10, 100, 80, 50, 10, 10);

        // Fill a rounded rectangle
        g.fillRoundRect(20, 110, 60, 30, 5, 5);

        // Draw crossing lines
        g.drawLine(100, 10, 230, 170);
        g.drawLine(100, 170, 230, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lines and Rectangles");
        LineAndRectangleUsingApplet panel = new LineAndRectangleUsingApplet();

        frame.add(panel);
        frame.setSize(280, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}