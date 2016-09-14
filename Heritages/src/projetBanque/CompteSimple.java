package projetBanque;

public class CompteSimple {
	// Attributs
	private static final int cadeau = 20;
	private static final int commission = 1;
	private String nom;
	private long numero;
	protected double solde;
	
	// Constructeurs
	public CompteSimple(){
		
	}
	
	public CompteSimple(String nom, long numero){
		this.nom = nom;
		this.numero = numero;
		this.solde = cadeau;
	}
	
	public CompteSimple(String nom, long numero, int apport){
		this(nom,numero);
		this.solde += apport;
	}
	
	// Méthodes
	// Debit avec decouvert non autorisé
	public boolean debiter(int s){
		if(s > 0 && this.solde >= s+commission){
			this.solde -= s+commission;
			return true;
		}
		return false;
	}

	// Crediter le compte
	public boolean crediter(int s){
		if(s > 0){
			this.solde += s-commission;
			return true;
		}
		return false;
	}
	
	// Virement vers un autre compte
	public boolean virement(int s, CompteSimple c){
		if(this.debiter(s))
			if(c.crediter(s))
				return true;
		return false;
	}
	
	// toString
	public String toString(){
		return this.getClass().getSimpleName() + " " + nom + " " + numero + " Solde: " + solde + "€";
	}
	
}
