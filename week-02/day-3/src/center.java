import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class center {

    public static void line (Graphics graphics,  int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }


    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int userx, userx2, userx3 = 0;
        int usery, usery2, usery3 = 0;

        for (int i = 0;i<3;i++) {
            System.out.println("number x");
            Scanner scanner = new Scanner(System.in);
            userx = scanner.nextInt();
            System.out.println("number y");
            Scanner scannery = new Scanner(System.in);
            usery = scannery.nextInt();

            line(graphics, userx,usery);
        }


//        System.out.println("number x2")
//        Scanner scannerx2 = new Scanner(System.in);
//        userx2 = scannerx2.nextInt();
//        System.out.println("number y2")
//        Scanner scannery2 = new Scanner(System.in);
//        usery2 = scannery2.nextInt();
//
//        System.out.println("number x3")
//        Scanner scannerx3 = new Scanner(System.in);
//        userx3 = scannerx3.nextInt();
//        System.out.println("number y3")
//        Scanner scannery3 = new Scanner(System.in);
//        usery3 = scannery3.nextInt();





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