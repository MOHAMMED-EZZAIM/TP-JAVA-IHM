package Exercice2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Fenetre extends JFrame {
	public Fenetre(){
		this.setTitle("My first window");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		JPanel pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		this.setContentPane(pan);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Fenetre();
	}
}
