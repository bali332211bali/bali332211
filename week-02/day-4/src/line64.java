import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class line64 {


    private static void addLine(Graphics graphics, int x, int y, int x2, int y2) {
        graphics.drawLine(x, y, x2, y2);
    }

    private static void right(Graphics graphics, int r, int x, int y, int x2, int y2, boolean v) {
        if (v) {
            graphics.setColor(new Color(100, 0, 180));
        } else {
            graphics.setColor(Color.GREEN);
        }

        for (int i = 0; i < 5 ; i++) {
            addLine(graphics, x, y+r*i, x2+r*i, y2);
            r++;
        }
        for (int i = 0; i < 3 ; i++) {
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

        for (int i = 0; i < 5 ; i++) {
            addLine(graphics, x, y+r*i, x2+r*i, y2);
            r++;
        }
        for (int i = 0; i < 3 ; i++) {
            addLine(graphics, x, y-r*i, x2-r*i, y2);
            r++;
        }
    }


    private static void left2(Graphics graphics, int r, int l, int j, int c, int k, boolean v) {
        right(graphics, r, WIDTH-l, HEIGHT/16+j, WIDTH*15/16-l, 0+j, v);
        left(graphics, r, 0+c, HEIGHT*15/16-k, WIDTH/16+c, HEIGHT-k, v);


    }


    public static void mainDraw(Graphics graphics) {

        int r = 1/4;
        int k = 7;
        int l = 0;
        for ( int i = 0; i < 8; i++) {
            left2(graphics, r, HEIGHT*7/8, HEIGHT*k/8, HEIGHT*0/4 ,HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*6/8, HEIGHT*k/8, HEIGHT*1/8, HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*5/8, HEIGHT*k/8, HEIGHT*2/8, HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*4/8, HEIGHT*k/8, HEIGHT*3/8, HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*3/8, HEIGHT*k/8, HEIGHT*4/8 ,HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*2/8, HEIGHT*k/8, HEIGHT*5/8, HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*1/8, HEIGHT*k/8, HEIGHT*6/8, HEIGHT*l/8, true);
            left2(graphics, r, HEIGHT*0/8, HEIGHT*k/8, HEIGHT*7/8, HEIGHT*l/8, true);
            k--;
            l++;
        }



//        left2(graphics, r, HEIGHT/4, 0, 0, HEIGHT/4, true);

//        left2(graphics, r, 0, HEIGHT/2, HEIGHT/2, 0, true);



//        right(graphics, r, WIDTH-WIDTH/2, HEIGHT/4+HEIGHT/2, WIDTH*3/4-WIDTH/2, 0+HEIGHT/2, true);
//        left(graphics, r, 0, HEIGHT*3/4, WIDTH/4, HEIGHT, true);




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