package packHash;

public class Commercial {
	// Attributs
	private int id;
	private String nom;
	private String prenom;
	
	// Constructeurs
	public Commercial(int id, String nom, String prenom){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// Codage du equals utilise auto par le get() pour verif la clef
	public boolean equals(Object X){
		Commercial c = (Commercial) X;
		return(id == c.id);
	}
	
	// Hachage de la clef
	public int hashCode(){
		return new Integer(id).hashCode();
	}
	
	public String toString(){
		return id + " " + nom + " " + prenom;
	}
}
