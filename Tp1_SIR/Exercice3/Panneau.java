package Exercice3;

import java.awt.*;
import javax.swing.JPanel;
public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp=new GradientPaint(0,0,Color.red,30,30,Color.blue,false);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.fillOval(20, 20, 75, 75);
    }
}

//public class Panneau extends JPanel {
//    public void paintComponent(Graphics g){
//        Font font = new Font("Courier", Font.BOLD, 20);
//        g.setFont(font);
//        g.setColor(Color.green);
//        g.drawString("Salam ! Les étudiants SIR !", 20, 20);
//    }
//}

//public class Panneau extends JPanel {
//    public void paintComponent(Graphics g){
//        g.drawRect(10, 10, 50, 60);
//        g.fillRect(65, 65, 30, 40);
//    }
//}

//public class Panneau extends JPanel {
//    public void paintComponent(Graphics g) {
//        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
//        System.out.println("Coucou !");
//        g.fillOval(20, 20, 75, 75);
//        //int x1 = this.getWidth()/4;
//        //int y1 = this.getHeight()/4;
//        //g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
//    }
//}

