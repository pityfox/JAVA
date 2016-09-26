package persistanceORM;

public class Patient {
	// Attributs
	private int id;
	private String nom, prenom;
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	
	// Constructeurs
	public Patient(){
		
	}
	
	public Patient(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//toString
	public String toString(){
		return id + " " + nom + " " + prenom;
	}
}
