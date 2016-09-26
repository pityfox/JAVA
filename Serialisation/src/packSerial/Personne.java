package packSerial;

import java.io.Serializable;

public class Personne implements Serializable{
	// ATtributs
	private String nom;
	private String prenom;
	private int age;
	private Adresse adresse;
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	// GEtters & Setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Constructeurs
	public Personne(){
		
	}
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Personne(String nom, String prenom, int age, Adresse adresse) {
		this(nom, prenom, age);
		this.adresse = adresse;
	}
	
	public String toString() {
		return prenom + " " + nom + " " + age + " " + adresse;
	}

	
	
}
