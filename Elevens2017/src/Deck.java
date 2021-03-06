import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	private List<Card> cards; //all the cards in the deck

	//number of not yet dealt cards, next card to be dealt is at size - 1
	private int size; 

	/*
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		cards = new ArrayList();
		for (int i = 0; i < ranks.length; i++) 
			for (String str : suits) 
				cards.add(new Card(ranks[i], str, values[i]));

		size = cards.size();
		shuffle();
	}

	//return true if empty (no undealt cards), false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	//returns number of undealt cards in this deck
	public int size() {
		return size;
	}

	//randomly shuffle cards, reset size to entire deck
	public void shuffle() {
		for (int k = cards.size() - 1; k > 0; k--) {
			int howMany = k + 1;
			int start = 0;
			int randPos = (int) (Math.random() * howMany) + start;
			Card temp = cards.get(k);
			cards.set(k, cards.get(randPos));
			cards.set(randPos, temp);
		}
		size = cards.size();
	}

	//return the card next card or null if deck is empty

	public Card deal()
	{
		if (isEmpty()) 
			return null;

		size --;
		return (Card)cards.get(size);
	}

	//return a string representation of this deck
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
}
