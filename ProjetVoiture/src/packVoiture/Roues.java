package packVoiture;

public class Roues {
	// Attributs
	private int nbRoues;
	
	// Constructeurs
	public Roues(){
		this.nbRoues = Methods.saisirInt("Nombre de roues :");
	}
	
	public Roues(int nb){
		this.nbRoues = nb;
	}
	
	// toString
	public String toString(){
		return "Nombre de roues : " + nbRoues;
	}
}
