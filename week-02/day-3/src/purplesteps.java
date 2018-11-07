import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purplesteps {


    private static void square(Graphics graphics, int x, int y, int s) {

        for( int i = 0; i<s*20;i+=s) {
            x =  i;
            y =  i;
            graphics.setColor(new Color(150,0,200));
            int[] xX = {x,x+s,x+s,x};
            int[] yY = {y,y,y+s,y+s};
            graphics.fillPolygon(xX,yY,4);

        }

    }

//    private static void steps(Graphics graphics, int number) {
//
//        graphics.setColor(new Color(150,0,200));
//        int[] x = {0+s, 0-s/2, 10+s/2, 10+s/2};
//        int[] y = {0-10, 10+s/2, 10+s/2, 0-s/2};
//        graphics.fillPolygon(x,y,4);
//
//    }

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

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