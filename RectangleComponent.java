
/**
 * Write a description of class RectangleComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class RectangleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(110, 130, 60, 60);
        Rectangle box2 = new Rectangle(170, 130, 60, 60);
        g2.draw(box);
        g2.draw(box2);
        //g2.drawString("Hello", 120, 150);
        g2.drawString("Bitches", getWidth()/2, getHeight()/2);
    }
}
