package PackVille;

public class Ville {
	
	// Attributs
	private String nom;
	private String pays;
	private String capitale;
	private int nbHabitants;
	private boolean isCapital;
	private String categorie;
	
	
	// Constructeurs
	public Ville(String nom, String pays, String capitale, int nbHabitants) {
		super();
		this.nom = nom;
		this.pays = pays;
		this.capitale = capitale;
		this.nbHabitants = nbHabitants;
		this.isCapital = isCapital(nom, capitale);
		this.categorie = categorie(nbHabitants);
	}

	
	// Méthodes
	// Compare le nom et la capitale
	private boolean isCapital(String nom, String capitale){
		return (nom.equals(capitale))?true:false;
	}

	// Retourne la categorie selon le niombre d'habitants
	private String categorie(int nbHabitants){
		int[] bornes = {5,10,15};
		String[] categ = {"petit","moyen","grand"};
		String cat = "NA";
		
		if(nbHabitants >= 0){
			for(int i=0;i<bornes.length;i++){
				if(nbHabitants < bornes[i]){
					cat = categ[i];
					break;
				}
			}
		}
		
		return cat;
	}
	
	// Compare la grandeur entre deux villes
	public void compare(Ville v2){
		String size = (this.nbHabitants == v2.nbHabitants)?"de même taille":
			(this.nbHabitants > v2.nbHabitants)?"plus grande":
				"plus petite";
		
		System.out.println(this.nom+" est "+size+" que "+v2.nom);
	}
	
	// StoString
	public String toString() {
		return nom + "_" + pays + "_" + capitale + "_" + ((isCapital)?"Je suis Capitale":"Je ne suis pas Capitale") + "_ma catégorie : " + categorie;
	}
	
	
	
	
}
