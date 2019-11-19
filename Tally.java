
/**
 * Write a description of class Tally here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tally
{
    private int value;
    /**
     * constructs the object with value 0
     */
    public Tally()
    {
        value = 0;
    }
    /**
     * Allows you to construct an Object Tally with an initial value
     * @param int
     */
    public Tally(int initialCount)
    {
       value = initialCount; 
    }
    /**
     * Returns the value of object Tally()
     */
    public int getValue()
    {
     return value;   
    }
    public void click()
    {
        value = value + 1;
    }
    public void click(int increment)
    {
        value = value + increment;
    }
    public void reset()
    {
        value = 0;
    }
    public void unclick()
    {
        value = value - 1;
    }
    public void unclick(int decrement)
    {
        value = value - decrement;
    }
}
