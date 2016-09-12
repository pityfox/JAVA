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
	// Constructeur par défaut prend la saisie de l'utilisateur
	public Salarie(){
		this.nom = new Methods().saisirString("Nom :");
		this.prenom = new Methods().saisirString("Prénom :");
		this.secu = new Methods().saisirLong("N° Sécurité Sociale :");
		this.salaire = new Methods().saisirInt("Salaire :");
		this.rib = new Rib();
		this.status = new Status();
	}
	
	// Constructeur par paramètres défini à l'appel
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
		return "\n- Salarié "+ nom + " " + prenom + " : \n\tN° de Sécu : " + secu + "\n\tsalaire : " + salaire + "\n\tRib : " + rib
				+ "\n\tStatus : " + status;
	}
		
	
}
