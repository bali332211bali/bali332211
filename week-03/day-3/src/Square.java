import sun.plugin2.main.client.WDonatePrivilege;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Square {






    private static void squares2(Graphics graphics, int x, int y, int w, int h) {
        squares(graphics, x, y, w, h);

        if (w >= 20 && h >= 20) {
            squares2(graphics, x + w / 3, y, w / 3, h / 3);
            squares2(graphics, x + w / 3, y + h * 2 / 3, w / 3, h / 3);
            squares2(graphics, x, y + h / 3, w / 3, h / 3);
            squares2(graphics, x + w * 2 / 3, y + h / 3, w / 3, h / 3);
        }
    }

    private static void squares(Graphics graphics, int x, int y, int w, int h) {
        graphics.drawRect(x + w / 3, y, w / 3, h / 3);
        graphics.drawRect(x + w / 3, y + h * 2 / 3, w / 3, h / 3);
        graphics.drawRect(x, y + h / 3, w / 3, h / 3);
        graphics.drawRect(x + w * 2 / 3, y + h / 3, w / 3, h / 3);
    }

    public static void mainDraw(Graphics graphics) {
        squares2(graphics, 0, 0, WIDTH, HEIGHT);
    }







    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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

            this.setBackground(Color.YELLOW);
        }
    }
}

