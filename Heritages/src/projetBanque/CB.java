package projetBanque;

public enum CB {
	visa(10),
	amex(15),
	MC(0);
	
	// Attributs
	private int prix;
	
	// Constructeurs
	CB(){
		
	}
	
	CB(int prix){
		this.prix = prix;
	}
	
	// Setters & Getters
	public int getPrix(){
		return prix;
	}
}
