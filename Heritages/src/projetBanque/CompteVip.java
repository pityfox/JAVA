package projetBanque;

public class CompteVip extends CompteSimple {
	// Attributs
	protected int commission = 0;
	
	// Constructeurs
	public CompteVip(String nom, long numero, int apport){
		super(nom,numero,apport);
	}
	
	// Crédit sans commission
	public boolean crediter(int s){
		if(s > 0){
			this.solde += s;
			return true;
		}
		return false;
	}
		
	// Debit avec decouvert autorisé sans com
	public boolean debiter(int s){
		if(s > 0){
			this.solde -= s;
			return true;
		}
		return false;
	}
		
}
