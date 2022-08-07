package CardGameWar;

public class Card {
	/*
	 * a. Card 
	 * 	i. Fields 
	 * 		1. value (contains a value from 2-14 representing cards 2-Ace) 
	 * 		2. name (e.g. Ace of Diamonds, or Two of Hearts) 
	 * 	ii. Methods 
	 * 		1. Getters and Setters 
	 * 		2. describe (prints out information about a card)
	 */

	private int value;
	public String name; 


	public int getValue() {
		return value;
	}
	
			//returns the assigned value for this instance of a card. 
	
	public void setValue(String value) {
		
		if(value.contains("Ace")) {
			this.value = 2;
		} else if(value.contains("Two")) {
			this.value = 3;
		} else if(value.contains("Three")) {
			this.value = 4;
		} else if(value.contains("Four")) {
			this.value = 5;
		} else if(value.contains("Five")) {
			this.value = 6;
		} else if(value.contains("Six")) {
			this.value = 7;
		} else if(value.contains("Seven")) {
			this.value = 8;
		} else if(value.contains("Eight")) {
			this.value = 9;
		} else if(value.contains("Nine")) {
			this.value = 10;
		} else if(value.contains("Ten")) {
			this.value = 11;
		} else if(value.contains("Jack")) {
			this.value = 12;
		} else if(value.contains("Queen")) {
			this.value = 13;
		} else if(value.contains("King")) {
			this.value = 14;
		}
		
	}
	
			//takes a card name as an argument, and assigns a value to this instance of a card based on what card to be used for comparison on who won a round. 
	
	public String getName() {
		return name;
	}
	
			//returns the name that has been set for this instance of a card. 
	
	public void setName(String name) {
		this.name = name;
	}
	
			//takes a name as an argument, and assigns it to this instance of a card. 

	public void describe(String card) {
	
		System.out.println("This card is: " + name + ".");
	
	}
			//takes a card name as an argument, and prints out a descriptor of the card.

}
