import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelope {

    private static void addLine(Graphics graphics, int x, int y, int x2, int y2) {
        graphics.drawLine(x,y,x2,y2);
    }

    private static void addLines(Graphics graphics, int r, int l, int x, int y, int x2, int y2) {

        for (int i = 0; i < l ; i++) {
            addLine(graphics, x+r*i, y, x2, y2-r*i);
            r++;
        }
        for (int i = 0; i < l ; i++) {
            addLine(graphics, x-r*i, y, x, y+r*i);
            r++;
        }
    }



    public static void mainDraw(Graphics graphics){


        int r = 6;
        int temp = r;
        int l = 7;
        graphics.setColor(Color.GREEN);
//        addLines(graphics, r, l,WIDTH/4, HEIGHT/2, WIDTH/2, HEIGHT/4);



        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH/4+r*i, HEIGHT/2, WIDTH/2, HEIGHT/4-r*i);
            r++;
        }
        r = temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH/4-r*i, HEIGHT/2, WIDTH/2, HEIGHT/4+r*i);
            r++;
        }

        r = temp;
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH*3/4-r*i, HEIGHT/2, WIDTH/2, HEIGHT/4-r*i);
            r++;
        }
        r = temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH*3/4+r*i, HEIGHT/2, WIDTH/2, HEIGHT/4+r*i);
            r++;
        }





        r = temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH/4+r*i, HEIGHT/2, WIDTH/2, HEIGHT*3/4+r*i);
            r++;
        }
        r= temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH/4-r*i, HEIGHT/2, WIDTH/2, HEIGHT*3/4-r*i);
            r++;
        }


        r = temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH*3/4+r*i, HEIGHT/2, WIDTH/2, HEIGHT*3/4-r*i);
            r++;
        }
        r = temp;
        for (int i = 0; i < l ; i++) {
            addLine(graphics, WIDTH*3/4-r*i, HEIGHT/2, WIDTH/2, HEIGHT*3/4+r*i);
            r++;
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