import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class positionsquare {

    private static void square(Graphics graphics, int x, int y) {
        int[] xX = {x,x+50,x+50,x};
        int[] yY = {y,y,y+50,y+50};
        graphics.drawPolygon(xX,yY,4);
    }


    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i<3;i++) {
            System.out.println("x y");
            Scanner scanner = new Scanner(System.in);
            int userx = scanner.nextInt();
            int usery = scanner.nextInt();

            square(graphics, userx, usery);

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