package packObserver;

public class Eleve {
	// Attributs
	private String nom;
	private int note = 0;
	private Prof prof;
	
	//Getters & Setters
	public void setNote(int note) {
		this.note = note;
	}
	
	public String getNom(){
		return nom;
	}

	// Constructeurs
	public Eleve(String nom, Prof p){
		this.nom = nom;
		this.prof = p;
	}
	
	// Méthodes
	// Récupère la note du prof
	public void update(){
		this.note = prof.getNote();
	}

	// toString
	public String toString() {
		return "Eleve " + nom + ", note=" + note + ", Prof "+ prof.getNom();
	}

	
}
