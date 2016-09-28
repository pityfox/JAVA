package dao;

import java.io.Serializable;

public class Visite implements Serializable {
	
	//Attributs
	private String date;
	private int idPatient;
	private String medecin;
	private int tarif;
	private int numSalle;
	
	
	
	//Constructeurs
	public Visite(String date, int idPatient, String medecin, int tarif, int numSalle) {
		this.date = date;
		this.idPatient = idPatient;
		this.medecin = medecin;
		this.tarif = tarif;
		this.numSalle = numSalle;
	}
	
	

	public Visite() {
	}



	//Getter and Setter 
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getIdPatient() {
		return idPatient;
	}
	
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
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



	public int getNumSalle() {
		return numSalle;
	}



	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}



	@Override
	public String toString() {
		return "Visite [date=" + date + ", idPatient=" + idPatient
				+ ", medecin=" + medecin + ", tarif=" + tarif + ", numSalle="
				+ numSalle + "]";
	}
	
	
	
	
	
	

}
