package dietester;

import java.util.Random;
/**
 * @author eeu213
 * @version V.2
 * @since 10/3/2014
 * @see DieTester.java
 * @see DieGame1.java
 * @see DieGame2.java
 * @param faceValue the face rolled on the dice
 * @param sides the maximum amount of sides of the dice
 * @param generator the random generator for what value the dice will roll
 */
public class Die 
{
    private int faceValue;    
    private int sides; 
    private Random generator;  
 
    /**
     * Constructor for the Die object
     * @param s the amount of sides on the dice
     */
    public Die(int s)
    {
        generator = new Random();
        this.faceValue = generator.nextInt(s) + 1;
        this.sides = s;        
    } 
 
    /**
     * Generates a random value for the die between 1 and the maximum amount of sides
     */
    public void throwDie()
    {
    this.faceValue = generator.nextInt(sides) + 1;
    } 
 
    /**
     * @return returns the facevalue to the object
     */
    public int getFaceValue()
    {        
    return faceValue;
    } 
    
    /**
     * @return returns the values of the object in a string
     */ 
    public String toString() 
    {        
        return getClass().getSimpleName() + "[faceValue=" + faceValue + ", sides=" + sides + "]";        
    } 
}