import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {


    private static void polygon2(Graphics graphics, int x, int y, int s) {
        polygon(graphics, x, y, s);
        if (s > 50) {
            polygon2(graphics, x, y, s/2);
            polygon2(graphics, x+s/2+s *1/3, y+s/2, s/2);
            polygon2(graphics, x, y+s/2+s/2, s/2);
        }
    }

    private static void polygon(Graphics graphics, int x, int y, int s) {
        int a = x+s/2+s *1/3;
        int b = y+s/2;

        int[] xX = {x,x+s/2,x+s/2+s*1/3,x+s/2,x  ,x-s*1/3};
        int[] yY = {y,y    ,y+s/2      ,y+s  ,y+s,y+s/2  };
        graphics.drawPolygon(xX,yY,6);

        int[] xX2 = {a, a+s/2, a+s/2+s*1/3, a+s/2, a  , a-s*1/3};
        int[] yY2 = {b, b    , b+s/2      , b+s  , b+s, b+s/2  };
        graphics.drawPolygon(xX2,yY2,6);

        int k = b+s/2;
        int[] xX3 = {x, x+s/2, x+s/2+s*1/3, x+s/2, x  , x-s*1/3};
        int[] yY3 = {k, k    , k+s/2      , k+s  , k+s, k+s/2  };
        graphics.drawPolygon(xX3,yY3,6);
    }

    private static void polygonStart(Graphics graphics, int x, int y, int s) {
        int[] xX = {x,x+s/2,x+s/2+s*1/3,x+s/2,x  ,x-s*1/3};
        int[] yY = {y,y    ,y+s/2      ,y+s  ,y+s,y+s/2  };
        graphics.drawPolygon(xX,yY,6);
    }




    public static void mainDraw(Graphics graphics) {

        polygonStart(graphics, WIDTH/4,0, WIDTH);
        polygon2(graphics, WIDTH/4, 0, WIDTH/2);


    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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
