import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lines {

  private static void lines2(Graphics graphics, int x, int y, int w, int h) {
    lines(graphics,x,y,w,h);

    if (w > 10) {
      lines2(graphics,x+w/3,y, w/3, h/3);
      lines2(graphics,x,y+h/3, w/3, h/3);
      lines2(graphics,x+w*2/3,y+h/3, w/3, h/3);
      lines2(graphics,x+w/3,y+h*2/3, w/3, h/3);
    }
  }

  private static void lines(Graphics graphics, int x, int y, int w, int h) {
    graphics.drawLine(x+w/3,y, x+w/3, y+h);
    graphics.drawLine(x+w*2/3,y, x+w*2/3, y+h);
    graphics.drawLine(x,y+h/3, x+w, y+h/3);
    graphics.drawLine(x,y+h*2/3, x+w, y+h*2/3);
  }

  public static void mainDraw(Graphics graphics) {
    lines2(graphics,0,0, WIDTH, HEIGHT);
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
