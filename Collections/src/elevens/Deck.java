package elevens;

import java.util.List;
import java.util.ArrayList;
public class Deck {

	private List<Card> cards;
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>(ranks.length * suits.length);
		int pos = 0;
		for(int x = 0; x < suits.length; x++) {
			for(int y = 0; y < ranks.length; y++) {
				cards.add(x, new Card(ranks[y], suits[x], values[y]));
				pos++;
			}
		}	
		size = cards.size();
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size > 0)
			return false;
		return true;		
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		Card[] temp = new Card[cards.size()];
		for(int x = 0; x < cards.size(); x++)
			temp[x] = cards.get(x);
		String nums = "";
		for(int x = 0; x < temp.length; x++) {
			int number = (int)(Math.random() * temp.length);
			while(nums.contains(number + "")) {
				number = (int)(Math.random() * temp.length);
			}
			cards.set(x, temp[number]);
			nums += number + "";
		}
	}
	

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if(size == 0)
			return null;
		Card out = cards.get(size - 1);
		size--;
		return out;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
	
	public static void main(String[]args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();
		
		

	}
	
	/***
	 * ACTIVITY 2
	 * 
	 * 1. Explain in your own words the relationship between a deck and a card.
	 * 
	 * A Deck is an ArrayList of the Card object. 
	 * 
	 * 
	 * 2. Consider the deck initialized with the statements below. How many cards does the deck contain?
	 * String[] ranks = {"jack", "queen", "king"};
	 * String[] suits = {"blue", "red"};
	 * int[] pointValues = {11, 12, 13};
	 * Deck d = new Deck(ranks, suits, pointValues);
	 * 
	 * The deck contains 2 cards. Throws an exception when trying to add suits[2]
	 * 
	 * 
	 * 3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
	 * (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
	 * value 10; an ace has point value 11; point values for 2, ..., 10 are 2, ..., 10, respectively. Specify the
	 * contents of the ranks, suits, and pointValues arrays so that the statement
	 * Deck d = new Deck(ranks, suits, pointValues);
	 * initializes a deck for a Twenty-One game.
	 * 
	 *  String[] ranks = {"1", "2", "3", "4"", "5", "6", "7", "8", "9", "10",jack", "queen", "king"};
	 * String[] suits = {"diamonds", "spades", "hearts", "clubs"};
	 * int[] pointValues = {11, 12, 13};
	 * 
	 * 
	 * 4. Does the order of elements of the ranks, suits, and pointValues arrays matter?
	 * 
	 * The order of elements of the ranks, suits, and pointValue arrays matter because otherwise the cards won't match up and you will be making entirely new cards altogether.
	 * 
	 * 
	 * ACTIVITY 7
	 * 
	 * 1. size, ranks, suits, point values, total cards, deck
	 * 2. you need to be able to get cards and eliminate cards from a deck. Also, add two cards selected to equal 11, and if there are no cards in 
	 * the pile that add up to 11, the algorithm must display "You lose"
	 * 3. yes, it performs all the tasks described in question 2
	 * 4. constructor and whenever u start a new game	
	 * 5. anotherPlayIsPossible()
	 * 6.
	 * 
	 */

}