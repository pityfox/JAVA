package packSalarie;

import java.util.Arrays;

public class Societe {
	// Attributs
	private String nom;
	private Salarie[] salaries = new Salarie[10];

	// Constructeurs
	// Par d�faut prend les entr�es de l'utilisateur
	public Societe(){
		this.nom = Methods.saisirString("Nom soci�t� :");
		
		// On demande si l'utilisateur veut ajouter des salari�s
		int ajoutSal = Methods.saisirInt("Ajouter des salari�s ? Tapez 1");
		while(ajoutSal == 1){			
			this.add(new Salarie());
			ajoutSal = Methods.saisirInt("Ajouter un autre salari� ? Tapez 1");
		}
	}

	public Societe(String nom){
		this.nom = nom;
	}

	//Methodes
	// Ajouter un salari� � la soci�t�
	public boolean add(Salarie sal){
		// Flag v�rifiant la pr�sence ou non du salari�
		boolean flag = false;
		// Flag de r�ponse, confirmation ajout
		boolean reponse = false;
		
		// V�rifier qu'il ne soit pas d�j� dans la base
		for(Salarie salarie:this.salaries){
			if(salarie != null && salarie.getSecu() == sal.getSecu()){
				flag = true;
			}
		}
		// S'il n'est pas d�j� pr�sent on l'ajoute
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

	// Retirer un salari� de la soci�t�
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
