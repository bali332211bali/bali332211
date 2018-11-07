import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purplesteps3d {

    private static void square(Graphics graphics, int x, int y, int size) {

        int size2 = size;
        int x2 = x;
        int y2 = y;

        int grow = 10;
        for( int i = 0; i < 6; i++) {

            x =  x+size;
            y =  y+size;
            size = size+i;

            graphics.setColor(new Color(150,0,200));
            int[] xX = {x,x+size,x+size,x};
            int[] yY = {y,y,y+size,y+size};
            graphics.fillPolygon(xX,yY,4);
        }


        for( int i = 0; i < 6; i++) {

            x2 =  x2+size2;
            y2 =  y2+size2;
            size2 = size2+i;

            graphics.setColor(Color.BLACK);
            int[] xX2 = {x2,x2+size2,x2+size2,x2};
            int[] yY2 = {y2,y2,y2+size2,y2+size2};
            graphics.drawPolygon(xX2,yY2,4);
        }


    }

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]


        square(graphics, 0,0, 15);



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
