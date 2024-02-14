package Exercice4;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Solution implements  ActionListener{
    static JFrame f;
    static JButton b1, b2, b3;
    static JLabel l;
    public Solution(){
        f = new JFrame("Panel contenant des boutons");
        l = new JLabel("panel label");
        b1 = new JButton("Bouton1");
        b2 = new JButton("Bouton2");
        b3 = new JButton("Bouton3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.setBackground(Color.red);
        f.add(p);
        f.setSize(300, 300);
        f.show();
    }
    public static void main(String[] args){
        new Solution();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(b1==e.getSource()){
            b1.setBackground(Color.blue);
        }
        if(b2==e.getSource()){
            b2.setBackground(Color.black);
            b2.setForeground(Color.white);
        }
        if(b3==e.getSource()){
            b3.setBackground(Color.yellow);
        }
    }
}


