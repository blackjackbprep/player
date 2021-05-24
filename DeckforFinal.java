import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class DeckforFinal {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Cardforfinal> cards;


	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;

	private  int saveSize;

	private List<Cardforfinal> DealtCards;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public DeckforFinal(String[] ranks, String[] suits, int[] values) {

		cards = new ArrayList<Cardforfinal>();
		for (int i = 0; i < ranks.length; i++) {
			for (String suitString : suits) {
				cards.add(new Cardforfinal(ranks[i], suitString, values[i]));
			}

		}

		size = cards.size();
		saveSize = size;

	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size < 1;
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
		Random r = new Random();
		Cardforfinal [] Shuffled = new Cardforfinal[52];

		int currentRand;

		for (int i = 0; i < Shuffled.length; i++) {
			int RandNum = r.nextInt(cards.size());
			currentRand = RandNum;
			Shuffled[i] = cards.get(currentRand);
			cards.remove(currentRand);

		}

		for (int i = 0; i < Shuffled.length; i++) {
			cards.add(Shuffled[i]);
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Cardforfinal deal() {
		if (size() < 1){
			return null;
		} else {
			Cardforfinal dealtCard = cards.get(0);
			cards.remove(0);
			size -= 1;
			DealtCards.add(dealtCard);
			return dealtCard;
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		return "";
	}
}
