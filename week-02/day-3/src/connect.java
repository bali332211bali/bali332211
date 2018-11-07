import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class connect {

    private static void line(Graphics graphics, int[][] endStart) {

        graphics.setColor(Color.GREEN);
        for(int l = 0; l < endStart.length-1;l++) {
            graphics.drawLine(
                    endStart[l][0], endStart[l][1],
                    endStart[l+1][0], endStart[l+1][1]);
        }
    }

    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}


        int[][] numbers = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] numbers2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};

        line(graphics, numbers);
        line(graphics, numbers2);



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