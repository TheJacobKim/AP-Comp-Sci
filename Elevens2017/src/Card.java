public class Card 
{
	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
		//initializes a new Card with the given rank, suit, and point value
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

	/* Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) 
	{
	    return (otherCard.suit().equals(suit())) && (otherCard.rank().equals(rank())) && (otherCard.pointValue() == pointValue());

	}

	/*
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 */
	@Override
	public String toString() 
	{	
		String a = "";
		a = "[" + this.rank + "] of [" + suit + "[ (point value = [" + pointValue + "])" + ".";
		return a;
	}
}
