
/**
 * Write a description of class Interest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class RectangleViewer

{
    public static void main(String[]args )
 {
     JFrame frame = new JFrame();
     frame.setSize(301, 401);
     frame.setTitle("This is pointless");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     RectangleComponent oof = new RectangleComponent();
     frame.add(oof);
     System.out.println("I Love 2 monitor lmao");
     
     
     
     
     frame.setVisible(true);
 }
}

