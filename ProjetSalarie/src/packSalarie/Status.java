package packSalarie;

public class Status {
	// Attributs
	private boolean cadre;
	private int annee;
	
	// Constructeurs
	public Status(){
		this.cadre = new Methods().saisirBool("Cadre ?");
		this.annee = new Methods().saisirInt("Ann�e :");
	}

	public Status(boolean cadre, int annee) {
		this.cadre = cadre;
		this.annee = annee;
	}

	// toString
	public String toString() {
		return ((cadre)?"Cadre":"Salari�") + " depuis " + annee + " ann�es";
	}
	
	
	
}
