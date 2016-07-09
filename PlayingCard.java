package playingcard;

/**
* @author eeu213
 * @version V.3
 * @since 24/2/2014
 * @see PlayingCardTester.java
 * @see PackBuilder.java
 */
public class PlayingCard {

    /**
     * @param SPADES a constant representing the Spade suit
     */
    public static final int SPADES = 0;

    /**
     * @param CLUBS a constant representing the Club suit
     */
    public static final int CLUBS = 1;

    /**
     * @param HEARTS a constant representing the Heart suit
     */
    public static final int HEARTS = 2;

    /**
     * @param DIAMONDS a constant representing the Diamonds suit
     */
    public static final int DIAMONDS = 3;

    /**
     * @param JACK a constant representing the Jack rank
     */
    public static final int JACK = 11;

    /**
     * @param QUEEN a constant representing the Queen rank
     */
    public static final int QUEEN = 12;

    /**
     * @param King a constant representing the King rank
     */
    public static final int KING = 13;

    /**
     * @param Ace a constant representing the Ace rank
     */
    public static final int ACE = 14;
    private final int suit;
    private final int rank;

    /**
     *
     * @param rank represents the rank as a value 2 - 14
     * @param suit represents the suit as a value 0 - 3
     */
    public PlayingCard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     *
     * @return returns the rank to the constructor of the object
     */
    public int getrank() {
        return rank;
    }

    /**
     *
     * @return returns the suit to the constructor of the object
     */
    public int getsuit() {
        return suit;
    }

    /**
     *
     * @return returns the suit sets as the actual image of the suit
     */
    public String suitToString() {
        switch (suit) {
            case SPADES:
                return "\u2660";
            case CLUBS:
                return "\u2663";
            case HEARTS:
                return "\u2665";
            case DIAMONDS:
                return "\u2666";
            default:
                return "null";
        }
    }

    /**
     *
     * @return returns the rank of the suit as a string, including the named ranks
     */
    public String rankToString() {

        switch (rank) {
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            case ACE:
                return "Ace";
            default:
                return "??";
        }
    }
    /**
     *
     * @return converts the variables into string format 
     */

    public String toString() {
        return getClass().getSimpleName() + "[rank=" + rankToString()
                + ", suit=" + suitToString() + "]";
    }

    /**
     *
     * @return formats the string 
     */
    public String format() {
        return rankToString() + suitToString();
    }

    /**
     *
     * @param other the other card to be tested
     * @return returns either true or false depending if carda(the current card) is the same as cardb(other)
     */
    public boolean equals(PlayingCard other) {

        return (this.suit == other.suit && this.rank == other.rank);

    }
}
