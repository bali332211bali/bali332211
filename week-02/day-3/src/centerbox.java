import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class centerbox {

    private static void square(Graphics graphics, int s) {

        int[] x = {WIDTH/2-s/2, WIDTH/2-s/2, WIDTH/2+s/2, WIDTH/2+s/2};
        int[] y = {HEIGHT/2-s/2, HEIGHT/2+s/2, HEIGHT/2+s/2, HEIGHT/2-s/2};
        graphics.drawPolygon(x,y,4);
    }


    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i<3; i++) {
            System.out.println("number");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();

            square(graphics, user);
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
