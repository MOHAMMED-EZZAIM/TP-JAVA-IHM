package Exercice2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class TestGraphics2D {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(30, 30, 300, 300);
        f.add(new MyCanvas());
        f.setVisible(true);
    }
}
class MyCanvas extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.drawArc(10, 20, 200, 200, 0, 135);
        g.fillArc(10, 20, 200, 200, 45, 270);//(1)
    }
}




