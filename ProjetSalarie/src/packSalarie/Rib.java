package packSalarie;

public class Rib {
	// Attributs
	private String numero;
	private String banque;
	
	// Constructeurs
	// Par défaut prend les entrées de l'utilisateur
	public Rib(){
		this.numero = new Methods().saisirString("Numéro RIB :");
		this.banque = new Methods().saisirString("Nom banque : ");
	}
	
	public Rib(String numero, String banque){
		this.numero = numero;
		this.banque = banque;
	}

	// toString
	public String toString() {
		return "Rib numero " + numero + ", banque : " + banque;
	}
	
	
	
}
