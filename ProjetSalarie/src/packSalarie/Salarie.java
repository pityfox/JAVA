package packSalarie;

public class Salarie {
	// Attributs
	private String nom;
	private String prenom;
	private long secu;
	private int salaire;
	private Rib rib;
	private Status status;
	
	
	// Getters & Setters
	public long getSecu() {
		return secu;
	}

	// Constructeurs
	// Constructeur par d�faut prend la saisie de l'utilisateur
	public Salarie(){
		this.nom = new Methods().saisirString("Nom :");
		this.prenom = new Methods().saisirString("Pr�nom :");
		this.secu = new Methods().saisirLong("N� S�curit� Sociale :");
		this.salaire = new Methods().saisirInt("Salaire :");
		this.rib = new Rib();
		this.status = new Status();
	}
	
	// Constructeur par param�tres d�fini � l'appel
	public Salarie(String nom, String prenom, long secu, int salaire, Rib rib, Status status) {
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;
		this.salaire = salaire;
		this.rib = rib;
		this.status = status;
	}


	// toString
	public String toString() {
		return "\n- Salari� "+ nom + " " + prenom + " : \n\tN� de S�cu : " + secu + "\n\tsalaire : " + salaire + "\n\tRib : " + rib
				+ "\n\tStatus : " + status;
	}
		
	
}
