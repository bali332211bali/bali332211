import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class board {

    private static void addLine (Graphics graphics, int x, int y, int size) {
        for( int i = 0; i < 10; i++) {
            x =  x+size;
            int[] xX = {x,x+size,x+size,x};
            int[] yY = {y,y,y+size,y+size};

            if(i % 2 == 0) {
                graphics.fillPolygon(xX,yY,4);
            } else {
                graphics.drawPolygon(xX,yY,4);
            }
        }
    }

    private static void addLine2 (Graphics graphics, int x, int y, int size) {
        for( int i = 0; i < 10; i++) {
            x =  x+size;
            int[] xX = {x,x+size,x+size,x};
            int[] yY = {y,y,y+size,y+size};

            if(i % 2 == 0) {
                graphics.drawPolygon(xX,yY,4);
            } else {
                graphics.fillPolygon(xX,yY,4);
            }
        }
    }




    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int size = 25;

        for (int i = 0; i<10; i++) {
            int y = i*size;

            if (i % 2 == 0) {
                addLine(graphics,0,y,size);
            } else {
                addLine2(graphics,0,y,size);
            }
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
        }
    }
}