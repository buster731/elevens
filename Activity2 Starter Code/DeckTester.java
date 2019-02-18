/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Two", "Seven", "Three"};
		String[] suits = {"Black", "Red"};
		int[] values = {2, 7, 3};
		Deck cards = new Deck(ranks, suits, values);
		System.out.println(cards.deal());
		System.out.println(cards.deal());
		System.out.println(cards.deal());
	}
}
