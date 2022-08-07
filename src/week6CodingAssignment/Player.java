package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

//c- Create class Player

public class Player {
	
	//fields of hand(list of Card), score(set to 0 in constructor), and name
	
	private List<Card> hand = new ArrayList<Card>();
	private String name;
	private int score;
	
	//constructor
	
	public Player(String name) {
		this.name = name;
		score = 0;
		
	}
	
	//describe(prints out info about the player and calls describe method for cards in hand list)
	public void describe() {
		System.out.println(name + " : " + hand);
		for (int i = 0; i < hand.size(); i++) {
			hand.get(i).describe();
		}
	}
	
	//flip(removes and returns the top card of the hand)
	
	public Card flip() {
		Card drawCard = hand.get(0);
		hand.remove(0);
		return drawCard;
	}
	
	//draw(takes a deck and calls the draw method on the deck, adding returned card to the hand field)
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//increment score(adds  one to the players score field)
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	
	//getters and setters
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		

}
