import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangle {


    private static void triangle(Graphics graphics, int[] x, int[] y) {
        graphics.drawPolygon(x,y,3);
    }

    private static void triangle2(Graphics graphics, int[] x, int[] y) {
        graphics.drawPolygon(x,y,3);
    }


    private static void triangleRow(Graphics graphics, int k, int startTopx, int startTopy) {

        for (int i = 0; i < k; i++) {
            int r = 8;
            int[] tx = {startTopx+r*i, startTopx+8+r*i, startTopx-8+r*i};
            int[] ty = {startTopy+2*r*i, startTopy+16+2*r*i, startTopy+16+2*r*i};

            if (i < k-1) {
                int[] tx2 = {startTopx+r*i, startTopx+8+r*i, startTopx-8+r*i};
                int[] ty2 = {startTopy+32+2*r*i, startTopy+16+2*r*i, startTopy+16+2*r*i};

                triangle2(graphics, tx2, ty2);
            }
            triangle(graphics, tx, ty);

        }
    }





    public static void mainDraw(Graphics graphics) {



//        triangleRow(graphics, 12, WIDTH/2, HEIGHT/3);
//        triangleRow(graphics, 10, WIDTH/2-8, HEIGHT/3+16);


        int l = 13;
        int r = 8;
        for (int i = 0; i < 20; i++) {
                l = l - 1;
            triangleRow(graphics, l, WIDTH/2-r*i, HEIGHT/3+2*r*i);
        }



//        int l2 = 13;
//        for (int i = 0; i < 20; i++) {
//            l2 = l2 - i;
//            triangleRow(graphics, l2, WIDTH/2-r*i, HEIGHT/3+2*r*i);
//        }












//        int k = 12;
//        for (int i = 0; i < k; i++) {
//
//            int r = 8;
//
//            int[] tx = {WIDTH/2+r*i, WIDTH/2+8+r*i, WIDTH/2-8+r*i};
//            int[] ty = {HEIGHT/3+2*r*i, HEIGHT/3+16+2*r*i, HEIGHT/3+16+2*r*i};
//
//            if (i < k-1) {
//                int[] tx2 = {WIDTH/2+r*i, WIDTH/2+8+r*i, WIDTH/2-8+r*i};
//                int[] ty2 = {HEIGHT/3+32+2*r*i, HEIGHT/3+16+2*r*i, HEIGHT/3+16+2*r*i};
//
//                triangle2(graphics, tx2, ty2);
//            }
//            triangle(graphics, tx, ty);
//
//        }


//        int[] tx = {WIDTH/2+8, WIDTH/2+16, WIDTH/2+0};
//        int[] ty = {HEIGHT/3+16, HEIGHT/3+32, HEIGHT/3+32};
//
//        int[] tx2 = {WIDTH/2+8, WIDTH/2+16, WIDTH/2+8};
//        int[] ty2 = {HEIGHT/3+48, HEIGHT/3+32, HEIGHT/3+32};




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