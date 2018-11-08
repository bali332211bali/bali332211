import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class line {



    private static void addLine(Graphics graphics, int x, int y, int x2, int y2) {
        graphics.drawLine(x, y, x2, y2);
    }


    public static void mainDraw(Graphics graphics) {

        int r = 16;
        graphics.setColor(new Color(100, 0, 180));
        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, WIDTH, HEIGHT/2+r*i, WIDTH/2+r*i, 0);
            r++;
        }
        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, WIDTH, HEIGHT/2-r*i, WIDTH/2-r*i, 0);
            r++;
        }

        r = 16;
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, 0, HEIGHT/2+r*i, WIDTH/2+r*i, HEIGHT);
            r++;
        }
        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, 0, HEIGHT/2-r*i, WIDTH/2-r*i, HEIGHT);
            r++;
        }


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