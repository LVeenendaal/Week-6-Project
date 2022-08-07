package CardGameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Card playerOneCard = new Card();
		Card playerTwoCard = new Card();
			//creates a card instance for each player to be used in comparing which card is higher and award points. 
		Deck gameDeck = new Deck();
		Player one = new Player();
		Player two = new Player();
			//creates a deck and two players for the game. 
		
		int ties = 0;
			//creates a variable to hold the number of ties during play. 
		one.setName("Mark");
		two.setName("Seth");
			//sets the player's names. 
	
					//System.out.println(gameDeck.getDeckOfCards());
						//test code to see the deck. 
		
		gameDeck.shuffle(); // shuffles all the cards in the named deck. 
		
					//System.out.println(gameDeck.getDeckOfCards());
					//System.out.println(gameDeck.getDeckOfCards().size());
						//test code to see if the deck shuffled correctly and how many cards there are in the deck. 
		
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				one.draw(gameDeck.getDeckOfCards());
			} else {
				two.draw(gameDeck.getDeckOfCards());
			}
		}
		
					//one.describe();
					//two.describe();
						//test code to check each player's hands for 26 cards. 
		
		for (int i = 0; i < 26; i++) {
	
			playerOneCard.setValue(one.flip());
			playerTwoCard.setValue(two.flip());
				//calls the flip method on each player and sets the value of the flipped card to each player's card. 
			
					//System.out.println(playerOneCard.getValue());
					//System.out.println(playerTwoCard.getValue());
						//test code to check that values are assigned to player cards properly. 
			
			if(playerOneCard.getValue() > playerTwoCard.getValue()) {
				one.incrementScore(); //adds one to player one's score if their card had a higher value.
			} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				two.incrementScore(); //adds one to player two's score if their card had a higher value.
			} else if (playerOneCard.getValue() == playerTwoCard.getValue()) {
				ties ++;	//adds one to ties if the player's card's values are equal. 
			}
			
				//all of this is run 26 times till both players have no more cards to flip. 
		
		}
		
			
	    System.out.println(one.getName() + ":" + one.getScore());
		System.out.println(two.getName() + ":" + two.getScore());
			//outputs the final scores.
		
		
		if (one.getScore() > two.getScore()) {
			System.out.println(one.getName() + " wins with " + one.getScore() + " points!");
			System.out.println("Number of ties: " + ties);
		} else if (two.getScore() > one.getScore()) {
			System.out.println(two.getName() + " wins with " + two.getScore() + " points!");
			System.out.println("Number of ties: " + ties);
		} else if (one.getScore() == two.getScore()) {
			System.out.println("It's a draw!");
			System.out.println("Number of ties: " + ties);
		}
			//based on the final scores, outputs who won or if no one wins, as well as the number of ties. 
			
	}

}
