package packSingleton;

public class Poste {
	private String nom;
	
	public Poste(String nom){
		this.nom = nom;
	}
	
	public void print(String msg){
		Spooler.getInstance().print(nom+": "+msg);
	}
}
