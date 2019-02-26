package elevens;

public class Card {

	private String suit;

	private String rank;

	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}


	public String suit() {
		return suit;
   }


	public String rank() {
	return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		if(this.rank() == otherCard.rank() &&
		   this.suit() == otherCard.suit() &&
		   this.pointValue() == otherCard.pointValue())
			return true;
		return false;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}

/**
 * Q1: (5s, 6c) or (5c, 6c)
 * Q2: yes, because if two of them sum to 11, you'd be left with one card left.
 * also, since there are an even number of cards and the cards are removed in pairs, 
 * having three cards left that aren't J, Q, and K is impossible.
 * Q3: no, as making one play won't inhibit your ability to make the other immediately after. 
 * also, all the new cards are random, so you'd need to get lucky to get a new combination adding
 * to 11
 */

