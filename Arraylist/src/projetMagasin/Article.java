package projetMagasin;

public abstract class Article {
	// Attributs
	private String nom;
	protected int prix;
	
	// SEtters & Getters
	public int getPrix(){
		return prix;
	}
	
	// Constructeurs
	public Article(String nom){
		this.nom = nom;
	}
	
	public Article(String nom, String modele, int prix){
		this.nom = nom;
		this.prix = prix;
	}
	
	// toString
	public String toString(){
		return nom;
	}
}
