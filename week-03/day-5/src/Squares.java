import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

  private static void squares2(Graphics graphics, int x, int y, int w, int h) {
    squares(graphics, x,y,w,h);

    if (w > 10 && h > 10) {
      squares2(graphics,x+w/3, y-h*2/3, w/3,h/3);
      squares2(graphics,x+w/3, y-h*2/3+h*2, w/3,h/3);
      squares2(graphics,x+w/3+w, y-h*2/3, w/3,h/3);
      squares2(graphics,x+w/3+w, y-h*2/3+h, w/3,h/3);
      squares2(graphics,x+w/3+w, y-h*2/3+h*2, w/3,h/3);
      squares2(graphics,x+w/3-w, y-h*2/3+h*2, w/3,h/3);
      squares2(graphics,x+w/3-w, y-h*2/3+h, w/3,h/3);
      squares2(graphics,x+w/3-w, y-h*2/3, w/3,h/3);
    }
  }

  private static void squares(Graphics graphics, int x, int y, int w, int h) {

    graphics.fillRect(x+w/3, y-h*2/3, w/3,h/3);
    graphics.fillRect(x+w/3, y-h*2/3+h*2, w/3,h/3);
    graphics.fillRect(x+w/3+w, y-h*2/3, w/3,h/3);
    graphics.fillRect(x+w/3+w, y-h*2/3+h, w/3,h/3);
    graphics.fillRect(x+w/3+w, y-h*2/3+h*2, w/3,h/3);
    graphics.fillRect(x+w/3-w, y-h*2/3+h*2, w/3,h/3);
    graphics.fillRect(x+w/3-w, y-h*2/3+h, w/3,h/3);
    graphics.fillRect(x+w/3-w, y-h*2/3, w/3,h/3);
  }

  public static void mainDraw(Graphics graphics) {

    squares2(graphics,WIDTH/2-WIDTH/6, HEIGHT/2-HEIGHT/6, WIDTH/3, HEIGHT/3);
    graphics.fillRect(WIDTH/2-WIDTH/6, HEIGHT/2-HEIGHT/6,WIDTH/3,HEIGHT/3);


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
    }
  }
}
