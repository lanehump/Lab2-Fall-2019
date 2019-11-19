
/**
 * Write a description of class PerimeterTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class PerimeterTester
{
    public static void main(String[]args)
    {
        Rectangle box = new Rectangle(10, 10, 20, 40);// here i create the rectangle object \
        System.out.println("Height:" +box.getHeight());// here i get the height
        System.out.println("Width:" +box.getWidth());// here i get the width
        System.out.println("Expected Perimeter: 120");
        System.out.println("Calculated Perimeter: " +(2 * box.getHeight() + 2 * box.getWidth()));
        
        
        
        
    }
    
    
    
}
