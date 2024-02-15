package Exercice1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Fenetre {
    static JFrame f;
    static JButton b1, b2, b3, b4;
    static JLabel l;
    public static void main(String[] args){
        f = new JFrame("Panel en BorderLayout");
        l = new JLabel("Label");
        b1 = new JButton("Bouton1");
        b2 = new JButton("Bouton2");
        b3 = new JButton("Bouton3");
        b4 = new JButton("Bouton4");
        JPanel p = new JPanel(new BorderLayout());
        p.add(b1, BorderLayout.NORTH);
        p.add(b2, BorderLayout.SOUTH);
        p.add(b3, BorderLayout.EAST);
        p.add(b4, BorderLayout.WEST);
        p.add(l, BorderLayout.CENTER);
        p.setBackground(Color.red);
        f.add(p);
        f.setSize(300, 300);
        f.show();
    }
}
