package CardGameWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	/*
	 * c. Player 
	 * 	i. Fields 
	 * 		1. hand (List of Card) 
	 * 		2. score (set to 0 in the constructor) 
	 * 		3. name 
	 * 	ii. Methods 
	 * 		1. describe (prints out information about the player and calls the describe method for each card in the Hand List) 
	 * 		2. flip (removes and returns the top card of the Hand) 
	 * 		3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field) 
	 * 		4. incrementScore (adds 1 to the Player’s score field)
	 */
	
	public List<String> hand = new ArrayList<String>();
	public int score = 0;
	private String name;

	Card playerCard = new Card();
	Deck playerDeck = new Deck();	
		//instantiates a card and a deck to be used in later methods for a player. 
	
	public void describe() {
		System.out.println("Player " + name + " has " + score + " points.");
		
		for(int i = 0; i < hand.size(); i ++) {
			playerCard.setName(hand.get(i));
			playerCard.describe(hand.get(i));
		
		}
	}
	
		//prints out the player name and score, then for every card in the hand it gives it a name which is then used in the describe method. 
		//the describe method prints out a description of the card. 
	
	public String flip() {
		
		String flippedCard = hand.get(0);
			//stores the top card as a string. 
		hand.remove(hand.get(0));
			//removes the top card from the player's hand. 
		return flippedCard;
			//returns the stored top card. 
	}
	
	public void draw(List<String> deckInPlay) {
		
		hand.add(playerDeck.draw(deckInPlay)); 
		
			//takes the deck for the current game as an argument, calls the draw method on it, and adds that card to the player's hand. 
		
	}
	
	public void incrementScore() {
		
		score ++;
			//adds one to the player's score when called. 
	}
	
	public String getName() {
		return name;
			//returns the player's name when called. 
	}
	
	public void setName(String name) {
		this.name = name;
			//takes a name as an argument, and sets this player's name to that name. 
	}
	
	public int getScore() {
		return score;
			//returns the score of this player when called. 
	}
}
