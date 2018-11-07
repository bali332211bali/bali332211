import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class centeredsquare {



    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.


        graphics.setColor(Color.GREEN);
        int[] x = {WIDTH/2-5, WIDTH/2-5, WIDTH/2+5, WIDTH/2+5};
        int[] y = {HEIGHT/2-5, HEIGHT/2+5, HEIGHT/2+5, HEIGHT/2-5};

        graphics.drawPolygon(x,y,4);


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

            this.setBackground(Color.BLACK);
        }
    }
}