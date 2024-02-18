package WARGAME;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	
	public class Deck {
		private List<Card> cards;
		
		public Deck() {
			cards = new ArrayList<>();
			populateDeck();	
		}
		
		private void populateDeck() {
			String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
			String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
			
			for (String suit : suits) {
				for (int i = 0; i < names.length; i++) {
					cards.add(new Card(values[i], names[i] + " of " + suit));
				}
			
			}
		}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(cards.size() - 1);
		
	}
	}
	
			
	


