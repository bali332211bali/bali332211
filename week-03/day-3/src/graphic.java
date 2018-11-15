import sun.plugin2.main.client.WDonatePrivilege;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class graphic {

  private static void square(Graphics graphics, int r) {
    graphics.drawRect(WIDTH*1/3,HEIGHT*0/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(WIDTH*0/3,HEIGHT*1/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(WIDTH*1/3,HEIGHT*2/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(WIDTH*2/3,HEIGHT*1/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
  }

  private static void square2(Graphics graphics, int r, int k, int c, int l) {
    int a = c;
    graphics.drawRect(a*3*l,a*1*l, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*4*l,a*0*l, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*4*l,a*2*l, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*5*l,a*1*l, WIDTH*1/(3*r), HEIGHT*1/(3*r));
  }

  private static void square3(Graphics graphics, int r, int k, int c) {
    int a = c;
    graphics.drawRect(a*0,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*1,a*3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*1,a*5, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*2,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
  }

  private static void square4(Graphics graphics, int r, int k, int c) {
    int a = c;
    graphics.drawRect(a*3,a*7, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*4,a*6, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*4,a*8, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*5,a*7, WIDTH*1/(3*r), HEIGHT*1/(3*r));
  }

  private static void square5(Graphics graphics, int r, int k, int c) {
    int a = c;
    graphics.drawRect(a*6,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*7,a*3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*7,a*5, WIDTH*1/(3*r), HEIGHT*1/(3*r));
    graphics.drawRect(a*8,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
  }

//  private static void square2(Graphics graphics, int r, int k) {
//    int a = WIDTH*1/9;
//    graphics.drawRect(a*4,a*0, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*1,a*3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*4,a*6, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*7,a*3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//  }
//
//  private static void square3(Graphics graphics, int r, int k) {
//    int a = WIDTH*1/9;
//    graphics.drawRect(a*5,a*1, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*2,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*5,a*7, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*8,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//  }
//
//  private static void square4(Graphics graphics, int r, int k) {
//    int a = WIDTH*1/9;
//    graphics.drawRect(a*3,a*1, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*1,a*5, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*4,a*8, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*7,a*5, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//  }
//
//  private static void square5(Graphics graphics, int r, int k) {
//    int a = WIDTH*1/9;
//    graphics.drawRect(a*4,a*2, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*0,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*3,a*7, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(a*6,a*4, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//  }




//  private static void square2(Graphics graphics, int r, int k, int c, int l) {
//    graphics.drawRect(WIDTH*1/3,HEIGHT*0/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(WIDTH*0/3,HEIGHT*1/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(WIDTH*1/3,HEIGHT*2/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//    graphics.drawRect(WIDTH*2/3,HEIGHT*1/3, WIDTH*1/(3*r), HEIGHT*1/(3*r));
//  }




//  private static void make(Graphics graphics, int n, int k) {
//    if (n > 1) {
//      make(graphics, (n-1), k);
//      line(graphics, n*k);
//    }
//    line(graphics, 1);
//  }

  public static void mainDraw(Graphics graphics) {

    int c;
    int l;
    l = 1;


    c = WIDTH*1/9;
    square2(graphics, 3,0, c, l);
    square3(graphics, 3,0, c);
    square4(graphics, 3,0, c);
    square5(graphics, 3,0, c);

    c = WIDTH*1/27;

    square2(graphics, 9,0, c, 1);
//    square3(graphics, 3,0, c);
//    square4(graphics, 3,0, c);
//    square5(graphics, 3,0, c);




    square(graphics, 1);

    //square(graphics, 6, WIDTH*1/9);

//    make(graphics, 2, 2);



  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

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

      this.setBackground(Color.YELLOW);
    }
  }
}

