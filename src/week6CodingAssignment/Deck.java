package week6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//b- Create class Deck

public class Deck {
	
	//field cards(list of cards)
	
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		String[] suit = {"Diamonds", "Hearts", "Spades", "Clubs"};
		String[] value = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (int i = 0; i < 4; i++) {
			for (int x = 2; x < 15; x++) {
				cards.add(new Card(x, value[x -2] + " of " + suit[i]));
			}
		}
	}
	
	//shuffle(randomizes the order of the cards)
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//draw(removes and returns the top card of the Cards field)
	
	public Card draw() {
		Card drawCard = cards.get(0);
		cards.remove(0);
		return drawCard;
	}
	

}
