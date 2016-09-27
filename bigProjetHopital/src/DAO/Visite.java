package DAO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visite implements Serializable {
	// Attributs
	private Patient patient;
	private String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	private int numSalle;
	private String medecin;
	private int tarif=23;
	
	// Getters & Setters	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	// Constructeurs
	public Visite(){
		
	}
	
	public Visite(Patient patient, int numSalle, String medecin) {
		this.patient = patient;
		this.numSalle = numSalle;
		this.medecin = medecin;
	}
	
	public Visite(Patient patient, int numSalle, String medecin, int tarif) {
		this(patient, numSalle, medecin);
		this.tarif = tarif;
	}
	
	public Visite(Patient patient, String date, int numSalle, String medecin, int tarif) {
		this(patient, numSalle, medecin, tarif);
		this.date = date;
	}
	// toString
	public String toString(){
		return date + ": salle " + numSalle + " avec Dr " + medecin + " - " + tarif +"€";
	}
}
