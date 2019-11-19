
/**
 * This will test the area of a rectangle box.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
import java.awt.Rectangle;
public class AreaTester
{
    public static void main(String[]args)
    {
        // here with the line of code below i created a rectangle object with the x and y value of 2
        // and a lenght of 20 and a width of 30
        Rectangle box = new Rectangle(20, 20, 20, 30);
        System.out.println("Width:" +box.getWidth());// here i print what my width is
        System.out.println("Height:" +box.getHeight());// here i print my length
        // here i print the expected area
        System.out.println("Expected Area: 600");
        // here i print the calculated area
       System.out.print("Calculated Area: ");
        System.out.println(box.getWidth() * box.getHeight());
        
        
       
        
        
       
        
        
    }

    
}
