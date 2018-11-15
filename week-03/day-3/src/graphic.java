import sun.plugin2.main.client.WDonatePrivilege;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class graphic {

  private static void square(Graphics graphics, int r) {
    graphics.drawRect(WIDTH*1/3,HEIGHT*0/3, WIDTH*1/3*r, HEIGHT*1/3*r);
    graphics.drawRect(WIDTH*0/3,HEIGHT*1/3, WIDTH*1/3*r, HEIGHT*1/3*r);
    graphics.drawRect(WIDTH*1/3,HEIGHT*2/3, WIDTH*1/3*r, HEIGHT*1/3*r);
    graphics.drawRect(WIDTH*2/3,HEIGHT*1/3, WIDTH*1/3*r, HEIGHT*1/3*r);
  }






//  private static void make(Graphics graphics, int n, int k) {
//    if (n > 1) {
//      make(graphics, (n-1), k);
//      line(graphics, n*k);
//    }
//    line(graphics, 1);
//  }

  public static void mainDraw(Graphics graphics) {

    square(graphics, 1);
    square(graphics, (1/2));

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

