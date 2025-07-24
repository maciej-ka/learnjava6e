// No package declared here. This class will be part of the
// "default" package.

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyApp {
  public static void main(String args[]) {
    System.out.println("My next thing");

    JFrame frame = new JFrame("Hello, Java!");
    frame.setSize(300, 150);

    JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
    frame.add(new HelloComponent());
    frame.add(label);
    frame.setVisible(true);
  }
}

class HelloComponent extends JComponent {
  public void paintComponent(Graphics g) {
    g.drawString("Hello, MaciejKa!", 125, 95);
    g.drawString("Hello, in Java!", 25, 95);
  }
}

