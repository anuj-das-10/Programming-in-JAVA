import java.awt.event.*; 
import javax.swing.*;
 
public class ClickCoordinates {
  public static void main(String[] args) {  
  JFrame f = new JFrame("Get Clicked Coordinates");
  JPanel panel = new JPanel();
  f.add(panel);
  System.out.println("CO-ORDINATES OF THE CURSOR (where clicked):");
 
  panel.addMouseListener(new MouseAdapter() {
        @Override 
        public void mousePressed(MouseEvent e) {
        System.out.println(e.getX() + "," + e.getY());
        }
  });
  
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(400, 400);
  f.setVisible(true);
  }
}