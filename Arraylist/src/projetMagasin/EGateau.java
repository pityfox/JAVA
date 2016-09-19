package projetMagasin;

public enum EGateau {
	choc(1),
	vanille(2);
	
	private int prix;
	
	public int getPrix(){
		return prix;
	}
	
	private EGateau(int prix){
		this.prix = prix;
	}
	
	public String toString(){
		return this.name() + " " + this.prix + "€";
	}
}
