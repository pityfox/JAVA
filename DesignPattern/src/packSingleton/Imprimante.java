package packSingleton;

public class Imprimante {
	// Attributs
	private String nom;
	
	// Constructeurs
	public Imprimante(String nom) {
		this.nom = nom;
	}
	
	//M�thodes
	public void print(String msg){
		System.out.println(nom + ": " +msg);
	}
}
