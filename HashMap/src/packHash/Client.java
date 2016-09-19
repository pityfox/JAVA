package packHash;

public class Client {
	// Attributs
	private String nom;
	private int nbSalarie;
	private EPole pole;
	
	// Constructeurs
	public Client(String nom, int nbSalarie, EPole pole){
		this.nom = nom;
		this.nbSalarie = nbSalarie;
		this.pole = pole;
	}
	
	public String toString(){
		return nom + " " + nbSalarie + " Salariés, Pôle: " + pole;
	}
}
