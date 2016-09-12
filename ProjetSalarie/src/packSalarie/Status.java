package packSalarie;

public class Status {
	// Attributs
	private boolean cadre;
	private int annee;
	
	// Constructeurs
	public Status(){
		this.cadre = new Methods().saisirBool("Cadre ?");
		this.annee = new Methods().saisirInt("Année :");
	}

	public Status(boolean cadre, int annee) {
		this.cadre = cadre;
		this.annee = annee;
	}

	// toString
	public String toString() {
		return ((cadre)?"Cadre":"Salarié") + " depuis " + annee + " années";
	}
	
	
	
}
