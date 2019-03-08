package elevens;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ElevensBoard class represents the board in  a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
//	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		if (selectedCards.size() < 2)
			return false;
		else if (selectedCards.size() == 2) {
			int c1 = selectedCards.get(0);
			int c2 = selectedCards.get(1);
			return this.cardAt(c1).pointValue() + this.cardAt(c2).pointValue()==11;
		}
		else {
			return this.containsJQK(selectedCards);
		}
		
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return this.containsPairSum11() || this.containsJQK();
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	public boolean containsPairSum11() {
	    for(int var1 = 0; var1 < 9; ++var1) {
	        if (this.cardAt(var1) != null) {
	            for(int var2 = var1 + 1; var2 < 9; ++var2) {
	                if (this.cardAt(var2) != null && this.cardAt(var1).pointValue() + this.cardAt(var2).pointValue() == 11) {
	                    return true;
	                }
	            }
	        }
	    }

	    return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	public boolean containsJQK() {
	    ArrayList<Integer> var1 = new ArrayList<>();

	    for(int var2 = 0; var2 < 9; ++var2) {
	        if (this.cardAt(var2) != null) {
	            var1.add(new Integer(var2));
	        }
	    }

	    return this.containsJQK(var1);
	}

	public boolean containsJQK(List<Integer> var1) {
	    boolean var2 = false;
	    boolean var3 = false;
	    boolean var4 = false;
	    Iterator<Integer> var5 = var1.iterator();

	    while(var5.hasNext()) {
	        Integer var6 = (Integer)var5.next();
	        int var7 = var6;
	        if (this.cardAt(var7).rank().equals("jack")) {
	            var2 = true;
	        } else if (this.cardAt(var7).rank().equals("queen")) {
	            var3 = true;
	        } else if (this.cardAt(var7).rank().equals("king")) {
	            var4 = true;
	        }
	    }

	    return var2 && var3 && var4;
	}

	public void processPairSum11() {
	    ArrayList<Integer> var1 = new ArrayList<>();

	    for(int var2 = 0; var2 < 9; ++var2) {
	        if (this.cardAt(var2) != null) {
	            for(int var3 = var2 + 1; var3 < 9; ++var3) {
	                if (this.cardAt(var3) != null && this.cardAt(var2).pointValue() + this.cardAt(var3).pointValue() == 11) {
	                    var1.add(new Integer(var2));
	                    var1.add(new Integer(var3));
	                    this.replaceSelectedCards(var1);
	                    return;
	                }
	            }
	        }
	    }

	}

	public void processJQK() {
	    int var1 = -1;
	    int var2 = -1;
	    int var3 = -1;

	    for(int var4 = 0; var4 < 9; ++var4) {
	        if (this.cardAt(var4) != null) {
	            if (this.cardAt(var4).rank().equals("jack")) {
	                var1 = var4;
	            } else if (this.cardAt(var4).rank().equals("queen")) {
	                var2 = var4;
	            } else if (this.cardAt(var4).rank().equals("king")) {
	                var3 = var4;
	            }
	        }
	    }

	    ArrayList<Integer> var5 = new ArrayList<>();
	    var5.add(new Integer(var1));
	    var5.add(new Integer(var2));
	    var5.add(new Integer(var3));
	    this.replaceSelectedCards(var5);
	}

}
