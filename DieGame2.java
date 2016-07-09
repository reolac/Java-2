package dietester;
/**
 * @author eeu213
 * @version V.2
 * @since 14/3/2014
 * @see Die.java
 * @see DieTester.java
 * @see DieGame1.java
 */
public class DieGame2 
{
    /**
     * prints out a simple dice game for doubles
     */
    public static void main(String[] args) 
    {
        Die dice1 = new Die (6); 
        Die dice2 = new Die (6); // creates two dice objects both with sides of 6
        boolean gameOver = false; 
        int score = 0;
        int turns = 0; 
        
        System.out.println("Starting Doubles ...");
        System.out.println("die1\t\tdie2");
        System.out.println("****\t\t****");
        
        while (gameOver == false)
        {
            dice1.throwDie();
            dice2.throwDie(); // throws both dice
            turns ++; // increments the amount of turns after you throw
            
            if (dice1.getFaceValue() == dice2.getFaceValue()) // if the face value of dice 1 matches dice 2
                score ++; // add 1 to score
            
            System.out.println(dice1.getFaceValue() + "\t\t" 
                    + dice2.getFaceValue()); // prints out dice1 value then dice2 value
            
            if (turns == 3) 
                gameOver = true; // after 3 turns gameover
        }
        
        System.out.println("\nYour score = " + score); // prints out the score after the game is over       
    }
}