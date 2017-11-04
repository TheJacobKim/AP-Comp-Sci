import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board 
{

	private static final int BOARD_SIZE = 9; //number of cards on the board
	private static final String[] RANKS ={"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
	private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};
	private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	public ElevensBoard() 
	{
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
		if (selectedCards.size() == 2) {
			return findPairSum11(selectedCards).size() > 0;
		} 
		else if (selectedCards.size() == 3) {
			return findJQK(selectedCards).size() > 0;
		} 
		else {
			return false;
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
		List<Integer> cIndexes = cardIndexes();
		return findPairSum11(cIndexes).size() > 0 || findJQK(cIndexes).size() > 0;
		// ?
	}

	/**
	 * Look for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return a list of the indexes of an 11-pair, if an 11-pair was found;
	 *         an empty list, if an 11-pair was not found.
	 */
	private List<Integer> findPairSum11(List<Integer> selectedCards) 
	{
		List<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) 

			if (cardAt(i) != null) 
				for (int j = i + 1; j < 9; j++) 
					if ((cardAt(j) != null) && (cardAt(i).pointValue() + cardAt(j).pointValue() == 11)){
						a.add(i);
						a.add(j);
					}
		return a;
	}

	/**
	 * Look for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return a list of the indexes of a JQK, if a JQK was found;
	 *         an empty list, if a JQK was not found.
	 */
	private List<Integer> findJQK(List<Integer> selectedCards) 
	{
		List<Integer> a = new ArrayList<Integer>();

		int i = 0;
	    int j = 0;
	    int k = 0;
	    int A=0,B=0,C=0;
	    
	    for (Integer index : selectedCards) {
	      int m = index.intValue();
	      if (cardAt(m).rank().equals("jack")) {
	        i++;
	        A=m;
	      } else if (cardAt(m).rank().equals("queen")) {
	        j++;
	        B=m;
	      } else if (cardAt(m).rank().equals("king")) {
	        k++;
	        C=m;
	      }
	    }
	    if((i != 0) && (j != 0) && (k != 0))
	    {
	    	a.add(A);
	    	a.add(B);
	    	a.add(C);
	    }
	    return a;
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false otherwise.
	 */
	public boolean playIfPossible() {
		return playPairSum11IfPossible() || playJQKIfPossible();
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 11.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 11-pair play was found (and made); false otherwise.
	 */
	private boolean playPairSum11IfPossible() {
		List<Integer> foundIndexes = cardIndexes();
		List<Integer> cardsToReplace = findPairSum11(foundIndexes);
		if (cardsToReplace.size() > 0) {
			replaceSelectedCards(cardsToReplace);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Looks for a group of three face cards JQK.
	 * If found, replace them with the next three cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a JQK play was found (and made); false otherwise.
	 */
	private boolean playJQKIfPossible() {
		List<Integer> foundIndexes = cardIndexes();
		List<Integer> cardsToReplace = findJQK(foundIndexes);
		if (cardsToReplace.size() > 0) {
			replaceSelectedCards(cardsToReplace);
			return true;
		} 
		else {
			return false;
		}
	}
}
