package playingcard;

/**
* @author eeu213
 * @version V.3
 * @since 24/2/2014
 * @see PlayingCard.java 
 */
public class PlayingCardTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PlayingCard card1 = new PlayingCard(2, 1); // creates new objects and stores information
        PlayingCard card2 = new PlayingCard(2, 1);
        PlayingCard card3 = new PlayingCard(7, 2);
        PlayingCard card4 = new PlayingCard(14, 0);
        PlayingCard card5 = new PlayingCard(11, 3);
        PlayingCard card6 = new PlayingCard(11, 2);
        PlayingCard card7 = new PlayingCard(5, 0);
        PlayingCard card8 = new PlayingCard(12, 0);
        
        
        System.out.println(card1.toString()); // prints the values of objects as a string
        System.out.println(card2.toString()); 
        System.out.println(card3.toString());
        System.out.println(card4.toString());
        System.out.println(card5.toString());
        System.out.println(card6.toString());
        System.out.println(card7.toString());
        System.out.println(card8.toString());
        
        System.out.println("\n");
        
        System.out.println(card1.format()); // prints the format of each of the values
        System.out.println(card2.format()); 
        System.out.println(card3.format());
        System.out.println(card4.format());
        System.out.println(card5.format());
        System.out.println(card6.format());
        System.out.println(card7.format());
        System.out.println(card8.format());
        
        System.out.println("\n");
        
        System.out.println("The equality of card 1 and card 2 is " + card1.equals(card2)); // checks the equality of each card
        System.out.println("The equality of card 3 and card 4 is " + card3.equals(card4));
        System.out.println("The equality of card 5 and card 6 is " + card5.equals(card6));
        System.out.println("The equality of card 7 and card 8 is " + card7.equals(card8));
    }
}
