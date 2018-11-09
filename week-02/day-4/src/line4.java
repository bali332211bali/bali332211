import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class line4 {


    private static void addLine(Graphics graphics, int x, int y, int x2, int y2) {
        graphics.drawLine(x, y, x2, y2);
    }

    private static void right(Graphics graphics, int r, int x, int y, int x2, int y2, boolean v) {
        if (v) {
            graphics.setColor(new Color(100, 0, 180));
        } else {
            graphics.setColor(Color.GREEN);
        }

        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, x, y+r*i, x2+r*i, y2);
            r++;
        }
        for (int i = 0; i < 5 ; i++) {
            addLine(graphics, x, y-r*i, x2-r*i, y2);
            r++;
        }
    }


    private static void left(Graphics graphics, int r, int x, int y, int x2, int y2, boolean v) {
        if (v) {
            graphics.setColor(Color.GREEN);
        } else {
            graphics.setColor(new Color(100, 0, 180));
        }

        for (int i = 0; i < 7 ; i++) {
            addLine(graphics, x, y+r*i, x2+r*i, y2);
            r++;
        }
        for (int i = 0; i < 5 ; i++) {
            addLine(graphics, x, y-r*i, x2-r*i, y2);
            r++;
        }
    }


    private static void left2(Graphics graphics, int r, int l, int j, int c, int k, boolean v) {
        right(graphics, r, WIDTH-l, HEIGHT/4+j, WIDTH*3/4-l, 0+j, v);
        left(graphics, r, 0+c, HEIGHT*3/4-k, WIDTH/4+c, HEIGHT-k, v);


    }


    public static void mainDraw(Graphics graphics) {

        int r = 4;
        left2(graphics, r, HEIGHT/2, HEIGHT/2, 0 ,0, true);
        left2(graphics, r, HEIGHT/2, 0, 0, HEIGHT/2, true);
        left2(graphics, r, 0, 0, HEIGHT/2, HEIGHT/2, true);
        left2(graphics, r, 0, HEIGHT/2, HEIGHT/2, 0, true);



//        right(graphics, r, WIDTH-WIDTH/2, HEIGHT/4+HEIGHT/2, WIDTH*3/4-WIDTH/2, 0+HEIGHT/2, true);
//        left(graphics, r, 0, HEIGHT*3/4, WIDTH/4, HEIGHT, true);




//        graphics.setColor(new Color(100, 0, 180));
//        for (int i = 0; i < 7 ; i++) {
//            addLine(graphics, WIDTH, HEIGHT/2+r*i, WIDTH/2+r*i, 0);
//            r++;
//        }
//        for (int i = 0; i < 7 ; i++) {
//            addLine(graphics, WIDTH, HEIGHT/2-r*i, WIDTH/2-r*i, 0);
//            r++;
//        }
//
//        r = 16;
//        graphics.setColor(Color.GREEN);
//        for (int i = 0; i < 7 ; i++) {
//            addLine(graphics, 0, HEIGHT/2+r*i, WIDTH/2+r*i, HEIGHT);
//            r++;
//        }
//        for (int i = 0; i < 7 ; i++) {
//            addLine(graphics, 0, HEIGHT/2-r*i, WIDTH/2-r*i, HEIGHT);
//            r++;
//        }


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