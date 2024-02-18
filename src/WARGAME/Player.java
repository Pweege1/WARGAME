package WARGAME;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
		score = 0;
	}
	
	public void describe() {
		System.out.println(name + "'s hand:");
		for (Card card : hand) {
			card.describe();
		}
	}


    public Card flip() {
    	return hand.remove(hand.size() - 1);
    }
    
    public void draw(Deck deck) {
    	hand.add(deck.draw());
    }
    
    public void incrementScore() {
    	score++;
    }
    
    public int getScore() {
    	return score;
    }
    
    public String getName() {
    	return name;
    }
    
}