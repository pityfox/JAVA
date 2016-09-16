package projetMagasin;

public abstract class Article {
	// Attributs
	private String nom;
	private String modele = "";
	protected int prix;
	
	// SEtters & Getters
	public int getPrix(){
		return prix;
	}
	
	// Constructeurs
	public Article(String nom, String modele, int prix){
		this.nom = nom;
		this.modele = modele;
		this.prix = prix;
	}
	
	// toString
	public String toString(){
		return nom + "\t" + modele + "\t" + prix + "€";
	}
}
