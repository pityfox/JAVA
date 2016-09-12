package packVoiture;

public class Chassis {
	// Attributs
	private String reference;
	
	// Constructeurs
	public Chassis(){
		this.reference = Methods.saisirString("Référence chassis:");
	}
	
	public Chassis(String reference){
		this.reference = reference;
	}

	// toString
	public String toString() {
		return "Chassis [reference=" + reference + "]";
	}
	
}
