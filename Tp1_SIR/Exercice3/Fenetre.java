package Exercice3;
import javax.swing.JFrame;
public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("Dessin d’un rond plein ");
        this.setSize(150, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new Panneau());
//        this.setContentPane(new NvPanneau());
        this.setVisible(true);
    }
}


