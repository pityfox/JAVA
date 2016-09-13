package packFood;

public enum Boisson {
	eau(1),
	coca(2),
	sans;
	
	private int prix;
	
	public int getPrix() {
		return prix;
	}

	private Boisson(){
		
	}
	
	private Boisson(int prix){
		this.prix = prix;
	}
	
	//toString
	public String toString(){
		return name()+" "+prix+"€";
	}
}
