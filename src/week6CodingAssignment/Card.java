package week6CodingAssignment;

//a- Create class Card

public class Card {
	
	//fields of value and name
	
	private int value;
	private String name;
	
	//Constructor
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//getters and setters
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//describe method for a card
	public String describe() {
		return name;
	}
}
