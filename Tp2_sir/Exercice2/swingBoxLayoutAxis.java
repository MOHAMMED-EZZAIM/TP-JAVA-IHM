package Exercice2;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;

public class swingBoxLayoutAxis {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Exemple BoxLayout manager X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
//        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);//(1)
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);//(2)
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        JButton jb1 = new JButton("Bouton 1");
        JButton jb2 = new JButton("Bouton 2");
        JButton jb3 = new JButton("Bouton 3");
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

