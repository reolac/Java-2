package dietester;
/**
 * @author eeu213
 * @version V.2
 * @since 14/3/2014
 * @see Die.java
 * @see DieTester.java
 * @see DieGame2.java
 */
public class DieGame1 
{
    /**
     * prints out a simple dice game six or lose
     */
    public static void main(String[] args) 
    {
        Die dice1 = new Die (6); // creates a dice object with 6 sides
        int score = 6; 
        boolean gameOver = false; 
        
        System.out.println("Starting Six or Lose ...");
        System.out.println("\nDie face\tScore");
        System.out.println("********\t*****");
        
        while (gameOver == false)
        {            
            dice1.throwDie(); // throw the dice to generate a new value       
            
            if (dice1.getFaceValue() == 6) 
                gameOver = true; // if the value is 6 you win        
            
            else
                score--; // if the value is not deduct 1 score            
            
            if (score == 0) // if you run out of score
                gameOver = true; // you lose           
            
            System.out.println(dice1.getFaceValue() + "\t\t" + score); // prints the values of the dice and current score                                  
        }
        
        if (dice1.getFaceValue() == 6) 
            System.out.println("\nYou've thrown a six!!! You win with "
                    + "a score of " + score + "."); // if the dice value is 6 print out a message that you won
        else
            System.out.println("\nYou have not thrown a six. You lose."); // else print out a message that you lost        
    }
}