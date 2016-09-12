package packVoiture;

import java.util.Arrays;

public class Parking {
	//Attributs
	private String nom;
	private Voiture[] voitures = new Voiture[10];
	
	//Constructeurs
	public Parking(String nom){
		this.nom = nom;
	}
	
	//Méthodes
	//Ajout voiture
	public void add(Voiture voit){
		for(int i=0;i<this.voitures.length;i++){
			if(this.voitures[i] != null){
				this.voitures[i] = voit;
				break;
			}
		}
	}
	
	//Supprimer voiture
	public void remove(String matricule){
		for(int i=0;i<this.voitures.length;i++){
			if(this.voitures[i] != null && this.voitures[i].getMatricule().equals(matricule)){
				this.voitures[i] = null;
				break;
			}
		}
	}
	
	//Compter une marque
	public int getCountByMarque(String marque){
		int countMarque = 0;
		for(int i=0;i<this.voitures.length;i++){
			if(this.voitures[i] != null && this.voitures[i].getMarque().equals(marque)){
				countMarque++;
			}
		}
		return countMarque;
	}

	// toString
	public String toString() {
		return "Parking [nom=" + nom + ", voitures=" + Arrays.toString(voitures) + "]";
	}
	
	
}
