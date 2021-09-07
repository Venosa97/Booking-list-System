package enumTypes;

public class Card {

	 Suits MySuit;
	 Rank MyRank;
	
	public Card (Rank rank, Suits suits) {
		this.MyRank = rank;
		this.MySuit = suits;
	}
	
	public Rank getRank() {
		return this.MyRank;
	}
	
	public void setRank(Rank rank) {
		this.MyRank = rank;
	}
	
	public Suits getSuits() {
		return this.MySuit;
	}
	
	public void setSuits(Suits suits) {
		this.MySuit = suits;
	}
}
