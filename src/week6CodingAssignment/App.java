 package week6CodingAssignment;

 //create a class App with a main method
 
public class App {

	public static void main(String[] args) {

		//3- instantiate a deck and two players, call the shuffle method on the deck
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Nova");
		Player player2 = new Player("Silas");
		
		//4- using a traditional for loop, iterate 52 times calling the draw method on the other player using the deck instantiated
		
		for (int draw = 0; draw < 26; draw++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		
		//5- using a traditional for loop, iterate 26 times and call the flip method for each player
		//compare the value of each card returned and call the incremenetScore method on the player with the higher card value
		
		for (int i = 0; i < 26; i++) {
			Card player1FlipCard = player1.flip();
			Card player2FlipCard = player2.flip();
			
			System.out.println(player1.getName() + " drew " + player1FlipCard.getName());
			System.out.println(player2.getName() + " drew " + player2FlipCard.getName());
			
			if (player1FlipCard.getValue() > player2FlipCard.getValue()) {
				player1.incrementScore();
			} else if (player2FlipCard.getValue() > player1FlipCard.getValue()) {
				player2.incrementScore();
			}
		
		}
		
		//6- after the loop, compare the final score from each player
			
			System.out.println(player1.getName() + " scored: " + player1.getScore());
			System.out.println(player2.getName() + " scored: " + player2.getScore());
		
		//7- print the final score of each player and either player1, player2, or draw depending on which score is higher or if they are the same

			if (player1.getScore() > player2.getScore()) {
				System.out.println(player1.getName() + " is the winner!");
			} else if (player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + " is the winner!");
			} else {
				System.out.println("It is a draw!");
			}
	}

}
