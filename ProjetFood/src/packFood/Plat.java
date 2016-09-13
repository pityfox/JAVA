package packFood;

public enum Plat {
	dujour(4),
	salade(3),
	sans;
	
	private int prix;
	
	public int getPrix() {
		return prix;
	}
	
	private Plat(){
		
	}
	
	private Plat(int prix){
		this.prix = prix;
	}
	

	//toString
	public String toString(){
		return name()+" "+prix+"€";
	}
	
}
