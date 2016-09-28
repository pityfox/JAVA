package dao;

import java.io.Serializable;

public class Patient implements Serializable {
	
	//Attributs
	private int id;
	private String nom;
	private String prenom;
	
	
	//Constructeurs
	public Patient() {}
	
	
	
	public Patient(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	public Patient(int id) {
		this.id = id;
	}
	
	

	public Patient(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}



	//Getter and Setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ "]\n";
	}
	
	
	
	

}
