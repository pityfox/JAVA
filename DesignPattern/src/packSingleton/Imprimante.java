package packSingleton;

public class Imprimante {
	private String nom;
	
	public Imprimante(String nom) {
		this.nom = nom;
	}
	
	public void print(String msg){
		System.out.println(nom + ": " +msg);
	}
}
