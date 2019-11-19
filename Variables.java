
/**
 * Conversion of Kg to Lbs.
 * 
 * @author (Lane Humphreys) 
 * @version (09-03-19)
 */
public class Variables
{
    public static void main(String[]args)
    {
        int one = 10;
        int two = 50;
        int three = 100;
        double convert = 0.454 ;
        double four = (one / convert);// this is where i convert kilograms to pounds
        double five = (two / convert);
        double six = (three / convert);
        System.out.println(one + " Kg");// here is where the conversions are printed
        System.out.println(two + " Kg");
        System.out.println(three + " Kg");
        System.out.println(four + " Lbs");
        System.out.println(five + " Lbs");
        System.out.println(six + " Lbs");
    }

}
