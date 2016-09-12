package packVoiture;

public class Voiture {
	// Attributs
	private String matricule;
	private String marque;
	static final int maxVitesse = 300;
	static int count = 0;
	private int vitesse = 0;
	private Roues roues;
	private Chassis chassis;
	
	//Getters & Setters
	public static int getCount(){
		return count;
	}
	
	public String getMatricule(){
		return matricule;
	}
	
	public String getMarque(){
		return marque;
	}
	
	public int getVitesse(){
		return vitesse;
	}
	
	public void setRoues(int nb){
		this.roues = new Roues(nb);
	}
	
	public void setVitesse(int vit){
		this.vitesse = vit;
	}
	
	
	// Constructeurs
	public Voiture(){
		this.matricule = Methods.saisirString("Matricule :");
		this.marque = Methods.saisirString("Marque :");
		this.vitesse = Methods.saisirInt("Vitesse max :");
		this.roues = new Roues();
		this.chassis = new Chassis();
		count++;
	}
	
	public Voiture(String matricule, String marque, Roues r, Chassis c){
		this.matricule = matricule;
		this.marque = marque;
		this.roues = r;
		this.chassis = c;
		count++;
	}

	//Méthodes
	// Comparer deux voitures
	public static String comparer(Voiture voit1, Voiture voit2){
		return voit1.getMatricule() + " est " + ((voit1.getVitesse() > voit2.getVitesse())?"plus":"moins") + " rapide que " + voit2.getMatricule();
	}
	
	//toString
	public String toString() {
		return "Voiture [matricule=" + matricule + ", marque=" + marque + ", vitesse=" + vitesse + ", roues=" + roues
				+ ", chassis=" + chassis + "]";
	}
	
	
	
}
