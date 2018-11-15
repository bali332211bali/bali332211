import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {



    private static void polygon(Graphics graphics, int x, int y, int w, int h) {

        int[] xX = {w/4,w*3/4,w,w*3/4,w/4,x};
        int[] yY = {y,y,h/2,h,h,h/2};

        graphics.drawPolygon(xX,yY,6);
    }


    public static void mainDraw(Graphics graphics) {


        polygon(graphics, 0, 0, WIDTH, HEIGHT);

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