import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rainbow {

    private static void square (Graphics graphics, int s, int[] c) {

        int halfW = WIDTH/2;
        int user = s/2;

        int[] rainbowC = new int[3];
        int rainbow = (halfW-user)/6;

        for (int i = 0; i<6; i++) {
            rainbow = rainbow*i;
            rainbowC[0] = (i+1)*30;
            rainbowC[1] = (i+1)*30;
            rainbowC[2] = (i+1)*30;
            //graphics.setColor(new Color(rainbowC[0], rainbowC[1], rainbowC[2]));
            graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
            int[] x = {0+rainbow, 0+rainbow, WIDTH-rainbow, WIDTH-rainbow};
            int[] y = {0+rainbow, HEIGHT-rainbow, HEIGHT-rainbow, 0+rainbow};
            graphics.fillPolygon(x,y,4);
        }

        graphics.setColor(new Color(c[0], c[1], c[2]));
        int[] x = {WIDTH/2-s/2, WIDTH/2-s/2, WIDTH/2+s/2, WIDTH/2+s/2};
        int[] y = {HEIGHT/2-s/2, HEIGHT/2+s/2, HEIGHT/2+s/2, HEIGHT/2-s/2};
        graphics.fillPolygon(x,y,4);



    }



    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("color number");
        Scanner scanner2 = new Scanner(System.in);
        int userR = scanner2.nextInt();
        int userG = scanner2.nextInt();
        int userB = scanner2.nextInt();

        int[] RGB = {userR, userG, userB};

        square(graphics, user, RGB);






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