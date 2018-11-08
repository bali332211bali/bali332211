import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class hexagon {

    private static void addLine(Graphics graphics, int k) {
        int r = 28;
        int l = 32;
        for (int i = 0; i < k; i++) {
            int[] x = {WIDTH/2-10, WIDTH/2+10, WIDTH/2+10+8, WIDTH/2+10, WIDTH/2-10, WIDTH/2-10-8};
            int[] y = {HEIGHT/20+l*i, HEIGHT/20+l*i, HEIGHT/20+16+l*i, HEIGHT/20+32+l*i, HEIGHT/20+32+l*i, HEIGHT/20+16+l*i};
            graphics.drawPolygon(x,y,6);
        }
    }

    private static void addLine2(Graphics graphics, int r, int c, int l2, int j, int k) {

        int l = 32;
        for (int i = 0; i < k; i++) {
            int[] x = {WIDTH/2-10+r*c, WIDTH/2+10+r*c, WIDTH/2+10+8+r*c, WIDTH/2+10+r*c, WIDTH/2-10+r*c, WIDTH/2-10-8+r*c};
            int[] y = {HEIGHT/20+l*i+l2*j, HEIGHT/20+l*i+l2*j, HEIGHT/20+16+l*i+l2*j, HEIGHT/20+32+l*i+l2*j, HEIGHT/20+32+l*i+l2*j, HEIGHT/20+16+l*i+l2*j};
            graphics.drawPolygon(x,y,6);
        }
    }


    private static void addLine3(Graphics graphics, int r, int c, int l2, int j, int k) {

        int l = 32;
        for (int i = 0; i < k; i++) {
            int[] x = {WIDTH/2-10-r*c, WIDTH/2+10-r*c, WIDTH/2+10+8-r*c, WIDTH/2+10-r*c, WIDTH/2-10-r*c, WIDTH/2-10-8-r*c};
            int[] y = {HEIGHT/20+l*i+l2*j, HEIGHT/20+l*i+l2*j, HEIGHT/20+16+l*i+l2*j, HEIGHT/20+32+l*i+l2*j, HEIGHT/20+32+l*i+l2*j, HEIGHT/20+16+l*i+l2*j};
            graphics.drawPolygon(x,y,6);
        }
    }

    private static void right(Graphics graphics) {
        int r = 28;
        int l2 = 16;
        int k = 7;
        int c = 0;
        int j = 0;

        for ( int i = 0; i < 3; i++) {
            c++;
            j++;
            k--;
            addLine2(graphics, r, c, l2, j, k);
        }

    }

    private static void left(Graphics graphics) {
        int r = 28;
        int l2 = 16;
        int k = 7;
        int c = 0;
        int j = 0;
        for ( int i = 0; i < 3; i++) {
            c++;
            j++;
            k--;
            addLine3(graphics, r, c, l2, j, k);
        }
    }



    public static void mainDraw(Graphics graphics){
//        int r = 28;
//        int l2 = 16;
        int k = 7;
//        int c = 0;
//        int j = 0;

        addLine(graphics, k);
        right(graphics);
        left(graphics);



//        for ( int i = 0; i < 3; i++) {
//            c++;
//            j++;
//            k--;
//            addLine2(graphics, r, c, l2, j, k);
//        }

//        k = 7;
//        c = 0;
//        j = 0;
//
//        for ( int i = 0; i < 3; i++) {
//            c++;
//            j++;
//            k--;
//            addLine3(graphics, r, c, l2, j, k);
//        }



        for (int i = 0; i < 10; i++) {

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