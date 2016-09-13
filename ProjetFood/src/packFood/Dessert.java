package packFood;

public enum Dessert {
	glace(2),
	gateau(3),
	sans;
	
	private int prix;
	
	public int getPrix() {
		return prix;
	}
	
	private Dessert(){
		
	}
	
	private Dessert(int prix){
		this.prix = prix;
	}
	
	//toString
	public String toString(){
		return name()+" "+prix+"€";
	}
		
}
