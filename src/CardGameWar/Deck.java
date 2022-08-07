package CardGameWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	//b.	Deck
	/*
	 * i. Fields 
	 * 		1. cards (List of Card) 
	 * 
	 * ii. Methods 
	 * 		1. shuffle (randomizes the order of the cards) 
	 * 		2. draw (removes and returns the top card of the Card field)
	 */
	
	public String[] deckOfCards = {"Ace of Spades","Two of Spades","Three of Spades","Four of Spades","Five of Spades","Six of Spades","Seven of Spades","Eight of Spades","Nine of Spades","Ten of Spades","Jack of Spades","Queen of Spades","King of Spades",
			"Ace of Clubs","Two of Clubs","Three of Clubs","Four of Clubs","Five of Clubs","Six of Clubs","Seven of Clubs","Eight of Clubs","Nine of Clubs","Ten of Clubs","Jack of Clubs","Queen of Clubs","King of Clubs",
			"Ace of Diamonds","Two of Diamonds","Three of Diamonds","Four of Diamonds","Five of Diamonds","Six of Diamonds","Seven of Diamonds","Eight of Diamonds","Nine of Diamonds","Ten of Diamonds","Jack of Diamonds","Queen of Diamonds","King of Diamonds",
			"Ace of Hearts","Two of Hearts","Three of Hearts","Four of Hearts","Five of Hearts","Six of Hearts","Seven of Hearts","Eight of Hearts","Nine of Hearts","Ten of Hearts","Jack of Hearts","Queen of Hearts","King of Hearts"};
	
		//String array that holds every card that can be found in a standard deck. 
	
	List<String> deck = new ArrayList<> (Arrays.asList(deckOfCards));
			//converts deckOfCards into a list to be used more easily in other methods. 
										
														
	public List<String> shuffle() {
		
		Collections.shuffle(deck); //shuffles the deck. 
		
		return deck; //returns the shuffled deck. 
	}
	
	public String draw(List<String> deckInPlay) {

		String drawnCard = deckInPlay.get(0);	
		
		deckInPlay.remove(0);
		
		return drawnCard;
		
		//takes a deck as an argument, pulls and stores the top card, removes that top card from the deck, and outputs the card that was drawn. 
	}


	public List<String> getDeckOfCards() {
		
		return deck; //returns the deck as a list for used as an argument in the draw method. 
		
	}

}
