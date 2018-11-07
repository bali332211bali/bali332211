import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.



        for (int i = 0; i<4;i++) {
            int colorR = 1+(int)(Math.random()*255);
            graphics.setColor(new Color(colorR, colorR,1+(int)(Math.random()*255)));

            int r = 1+(int)(Math.random()*159);
            int[] x = {WIDTH/2-r, WIDTH/2-r, WIDTH/2+r, WIDTH/2+r};
            int[] y = {HEIGHT/2-r, HEIGHT/2+r, HEIGHT/2+r, HEIGHT/2-r};
            graphics.drawPolygon(x,y,4);
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