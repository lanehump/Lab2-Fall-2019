
/**
 * Write a description of class TallyTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TallyTester
{
 public static void main(String[]args )
 {
     Tally one = new Tally();
     one.click();
     one.click();
     one.click();
     one.click();
     one.unclick(52);
     one.click();
     one.click();
     one.click();
     one.click();
     System.out.println(one.getValue());
     
     
 }
}
