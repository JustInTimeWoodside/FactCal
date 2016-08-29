
/**
 * Write a description of class FactCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactCalc
{

    /**
     * Constructor for objects of class FactCalc
     */
    public FactCalc()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int factorial(int y)
    {
        int result = y;
        while (y != 1){
            result = result * y;
            y--;
            
        }
        return result;
    }
}
