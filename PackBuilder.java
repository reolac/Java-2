package playingcard;

/**
* @author eeu213
 * @version V.3
 * @since 24/2/2014
 * @see PlayingCard.java 
 */
public class PackBuilder {

    /**
     *
     * @param j representing suits 0 - 3
     * @param i representing rank 2 - 14
     * 
     */
    public static void main(String[] args) {

        int j = 0;
        int i = 2;      
        PlayingCard cards = new PlayingCard(i, j); // constructs a new PlayingCard object
        
        for (i = 3; j < 4 && i <= 15; i++)  // increments the rank
        {                        
            System.out.print(" " + cards.format()); 
            if (i == 15) // when rank reaches 15 increments suit and resets rank
            {
                j = j + 1;
                i = 2;       
                System.out.println(""); // divides the suits
            }            
            
            cards = new PlayingCard(i, j); // stores the next card to be printed
        }
    }
}
