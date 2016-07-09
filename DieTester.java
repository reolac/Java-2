package dietester;
/**
 * @author eeu213
 * @version V.2
 * @since 14/3/2014
 * @see Die.java
 * @see DieGame1.java
 * @see DieGame2.java
 */
public class DieTester 
{
    /**
     * prints out tests for the dice object
     */
    public static void main(String[] args) 
    {
        Die dice1 = new Die (6); // creates a die object with 6 sides
        System.out.println("DieTestrunning ...");
        
        System.out.println("\nTest 1: Test Constructor using toString");
        System.out.println(dice1.toString()); // prints out the object tostring
        
        System.out.println("\nTest 2: Test getFaceValue");        
        System.out.println("\nInspecting die face ...");
        System.out.println("Face value = " + dice1.getFaceValue()); // prints the face value
        
        System.out.println("\nTest 3: Test throwDie");        
        System.out.println("Die is being thrown ...");
        System.out.print("Face values generated ");
        dice1.throwDie(); // throws the dice to get a random value
        System.out.print(dice1.getFaceValue()); 
        for (int i = 1; i < 36; i++) // loops 36 times rolling the dice each time to get a value
        {
            dice1.throwDie();
            System.out.print(", " + dice1.getFaceValue());            
        }
    }
}