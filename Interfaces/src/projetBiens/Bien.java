package projetBiens;

public abstract class Bien implements Monnayable, Finalisable {
	private String nom;
	private int prix;
	
	public Bien(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public String toString(){
		return getClass().getSimpleName() + " " + nom + ": " + prix + "€";
	}
}
