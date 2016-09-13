
public enum Langues {
	java(1000,"lile"),
	csharp(2000),
	cplusplus("nantes"),
	python;
	
	private int prix;
	private String localite="paris";
	
	private Langues(int prix){
		this.prix = prix;
	}
	
	private Langues(int prix, String localite){
		this.prix = prix;
		this.localite = localite;
	}
	
	private Langues(String localite){
		this.localite = localite;
	}
	
	private Langues(){
		
	}
	
	public int getPrix(){
		return prix;
	}
	
	public String getLocalite(){
		return localite;
	}
	
	public String toString(){
		return name()+prix+localite;
	}
}
