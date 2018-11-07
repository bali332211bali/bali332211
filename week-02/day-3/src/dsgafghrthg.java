import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class dsgafghrthg {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.



        graphics.setColor(new Color(1+(int) (Math.random()*255),1+(int) (Math.random()*255),1+(int) (Math.random()*255)));
        graphics.fillOval(10,10,100,50);

        int[] xPoints ={10, 110, 110, 10};
        int[] yPoints ={10, 10, 110, 110};
        graphics.drawPolygon(xPoints, yPoints, 4);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);




        }
    }
}