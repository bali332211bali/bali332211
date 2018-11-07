import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class star {


    private static Color colors(Graphics graphics) {
        int gray = 100+(int)(Math.random()*120);
        return new Color(gray,gray,gray);
    }


    private static void addStar(Graphics graphics, int size) {
        graphics.setColor((colors(graphics)));
        int x = (int)(Math.random()*(WIDTH-size));
        int y = (int)(Math.random()*(HEIGHT-size));

        int[] xX = {x,x+size,x+size,x};
        int[] yY = {y,y,y+size,y+size};
        graphics.fillPolygon(xX,yY,4);

    }

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)


        for (int i = 0; i < 100; i++) {
            addStar(graphics, 10);
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