package projetBanque;

public class CompteCb extends CompteSimple {
	private CB cb;
	
	// Constructeurs
	public CompteCb(String nom, long numero){
		super(nom, numero);
		this.cb = CB.MC;
	}
	
	public CompteCb(String nom, long numero, CB cb){
		super(nom,numero);
		this.solde -= cb.getPrix();
		this.cb = cb;
	}
	
	public CompteCb(String nom, long numero, int apport, CB cb){
		this(nom, numero, cb);
		this.solde += apport;
	}
	
	// toString
	public String toString(){
		return super.toString() + " CB : " + cb.name();
	}
}
