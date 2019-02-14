/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card dimTwo = new Card("Two", "Diamond", 2);
		Card clbAce = new Card("Ace", "Club", 1);
		Card spdNine = new Card("Nine", "Spade", 9);
		
		System.out.println(dimTwo.toString());
		System.out.println(clbAce.toString());
		System.out.println(spdNine.toString());
		System.out.println(spdNine.matches(spdNine));
	}
}
