package Exercice1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaFenetre extends  JFrame implements ActionListener {
    JButton reveButton; JButton foiButton; JButton implicationButton;
    JButton butsButton; JButton actionButton;
    public MaFenetre() {
        super("Cinq clés de la réussite");
        setSize(348, 128); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        reveButton = new JButton("LE RÊVE");
        foiButton = new JButton("LA FOI");
        implicationButton = new JButton("L’IMPLICATION");
        butsButton = new JButton("LES BUTS");
        actionButton = new JButton("L’ACTION");

        reveButton.addActionListener(this);
        foiButton.addActionListener(this);
        implicationButton.addActionListener(this);
        butsButton.addActionListener(this);
        actionButton.addActionListener(this);

        add(reveButton); add(foiButton); add(implicationButton); add(butsButton);
        add(actionButton);
    }
    public static void main(String[] args) {
        MaFenetre f=new MaFenetre();
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        JOptionPane.showMessageDialog(this, "Bouton cliqué:"+s);
    }
}




