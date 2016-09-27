package DAO;

import java.io.Serializable;


public class Patient implements Serializable{
	// Attributs
	private int id;
	private String nom;
	private String prenom;
	
	// Getters & Setters
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
	
	// Constructeurs
	public Patient(){
		
	}
	
	public Patient(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// Codage du equals utilise auto par le get() pour verif la clef
	public boolean equals(Object X){
		Patient p = (Patient) X;
		return(id == p.id);
	}
	
	// Hachage de la clef
	public int hashCode(){
		return new Integer(id).hashCode();
	}
	
	// toString
	public String toString(){
		return id + " " + nom + " " + prenom;
	}
	
}
