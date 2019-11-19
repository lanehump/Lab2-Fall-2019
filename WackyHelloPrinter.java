
/**
 * This will print Hello World but switching the e's with o's and o's with e's.
 * 
 * @author (Lane Humphreys) 
 * @version (09-03-19)
 */
public class WackyHelloPrinter
{
    public static void main(String[]args)
    {
        String hello = "Hello World";
        
        String hello2 = hello.replace('e', 'x');// here i replace the e with an x 
        String hello3 = hello2.replace('o', 'e');// here i replace all of the o's with e's
        String hello4 = hello3.replace('x', 'o');// here i replace the x with an o
        
        System.out.println(hello4);
        
    }
    
}
