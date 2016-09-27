package metier;

import java.util.ArrayList;

import DAO.DAO_visite;
import DAO.Patient;
import DAO.Visite;

public class Salle {

	private int numeroSalle;
	private ArrayList<Visite> lv=new ArrayList<Visite>();
	private String medecin="Michel Cymes";
	private Hopital h;
	
	public Salle(int id){
		this.numeroSalle=id;
	}
	
	//Rajouter un patient à la liste (i.e., rajouter une visite)
	public void rajouterPatient(Patient p){
		if(p!=null)
		this.lv.add(new Visite(p, this.numeroSalle, medecin));
	}
	
	public int getNumeroSalle(){
		return this.numeroSalle;
	}
	
	public void abonner(Hopital h){
		this.h=h;
	}
	

	//Prévenir la secrétaire qu'elle peut envoyer un patient 
	public void salleDispo(){
		this.h.envoyerPatient(this);
	}
	
	//La secrétaire envoie un nouveau patient, on le rajoute à la liste
	public void notifier(Patient p){
		this.rajouterPatient(p);
	}
	
	public void saveDB(){
		new DAO_visite().saveAllVisite(this.lv);
		this.lv.clear();
	}
	
	public String afficherFile(){
		return h.afficherFile();
	}
	
	public String afficherListe(){
		return this.lv.toString();
	}
}
