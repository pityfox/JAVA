package packSalarie;

import java.util.Arrays;

public class Societe {
	// Attributs
	private String nom;
	private Salarie[] salaries = new Salarie[10];

	// Constructeurs
	// Par défaut prend les entrées de l'utilisateur
	public Societe(){
		this.nom = Methods.saisirString("Nom société :");
		
		// On demande si l'utilisateur veut ajouter des salariés
		int ajoutSal = Methods.saisirInt("Ajouter des salariés ? Tapez 1");
		while(ajoutSal == 1){			
			this.add(new Salarie());
			ajoutSal = Methods.saisirInt("Ajouter un autre salarié ? Tapez 1");
		}
	}

	public Societe(String nom){
		this.nom = nom;
	}

	//Methodes
	// Ajouter un salarié à la société
	public boolean add(Salarie sal){
		// Flag vérifiant la présence ou non du salarié
		boolean flag = false;
		// Flag de réponse, confirmation ajout
		boolean reponse = false;
		
		// Vérifier qu'il ne soit pas déjà dans la base
		for(Salarie salarie:this.salaries){
			if(salarie != null && salarie.getSecu() == sal.getSecu()){
				flag = true;
			}
		}
		// S'il n'est pas déjà présent on l'ajoute
		if(flag == false){
			for(int i=0;i<this.salaries.length;i++){
				if(this.salaries[i] == null){
					this.salaries[i] = sal;
					reponse = true;
					break;
				}
			}
		}
		return reponse;
	}

	// Retirer un salarié de la société
	public boolean remove(int secu){
		boolean flag = false;
		for(int i=0;i<this.salaries.length;i++){
			if(this.salaries[i] != null && this.salaries[i].getSecu() == secu){
				this.salaries[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	// toString
	public String toString() {
		String reponse = "\nLa Societe " + nom + " comporte les salaries suivants :\n";
		for (Salarie sal:salaries) reponse += (sal != null)?sal.toString():"";
		return reponse;
	}



}
