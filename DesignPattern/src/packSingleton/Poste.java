package packSingleton;

public class Poste {
	// Attributs
	private String nom;
	
	// Constructeurs
	public Poste(String nom){
		this.nom = nom;
	}
	
	//M�thodes
	public void print(String msg){
		Spooler.getInstance().print(nom+": "+msg);
	}
}
