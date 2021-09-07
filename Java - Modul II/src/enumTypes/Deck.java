package enumTypes;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> myDeck;
	
	public Deck () {
		this.myDeck =  new ArrayList <Card>();
		
		for (Rank rank : Rank.values()) {
			for (Suits suit : Suits.values()) {
				myDeck.add(new Card(rank,suit));
			}
		}
		
	}
	
	public  ArrayList<Card> getDeck() {
		return myDeck;
	}
	
	public static void main(String[] args) {
		Deck pachet = new Deck();
		
		for (Card item : pachet.getDeck()) {
			System.out.print(item.getRank() + " " + item.getSuits() + "\n");
		}
		
		// de ce nu merge in enhanced for,  pachet.getDeck() ?????
		
	}

}
