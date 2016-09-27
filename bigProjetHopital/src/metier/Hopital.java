package metier;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

import DAO.DAO_patient;
import DAO.DAO_visite;
import DAO.Patient;
import DAO.Visite;

public class Hopital {
	// Attributs
	private String secretaire;
	private LinkedList<Patient> lp;
	private static Hopital hp;
	private Salle [] s=new Salle[2];
	private HashMap<Patient, ArrayList<Visite>> historique;
	
	// Getters & Setters
	public Salle getSalle(int id){
		return s[id-1];
	}
	
	// Constructeurs
	private Hopital(String nom){
		this.secretaire=nom;
		this.lp=new LinkedList<Patient>();
		this.s[0]=new Salle(1);
		this.s[0].abonner(this);
		this.s[1]=new Salle(2);
		this.s[1].abonner(this);
		this.historique = createHistory();
		
	}
	
	// Instance unique Hopital
	public static Hopital getInstance(String nom){
		if (hp==null)
			hp=new Hopital(nom);
		return hp;
	}

	// Creation de l'historique des patients Hashmaps
	private HashMap<Patient, ArrayList<Visite>> createHistory(){
		HashMap<Patient, ArrayList<Visite>> hm = new HashMap<Patient, ArrayList<Visite>>();
		
		ArrayList<Visite> al = new DAO_visite().getAllVisite();
		
		for(Visite v:al)
			if(hm.get(v.getPatient()) != null){
				System.out.println("lol");
				hm.get(v.getPatient()).add(v);
			}
			else{
				ArrayList<Visite> alv = new ArrayList<Visite>();
				alv.add(v);
				hm.put(v.getPatient(), alv);
			}
		return hm;
	}
	
	// FiFo patients
	public LinkedList<Patient>getFilePatients(){
		return this.lp;
	}

	//On ajoute un patient à la liste s'il existe déjà en base
	public boolean ajoutPatientExistant(int id){
		Patient p=new DAO_patient().getPatientById(id);
		if (p!=null){
			lp.add(p);
			return true;
		}
		else return false;

	}

	// Lister Patients
	public ArrayList<Patient> listerPatients(String tri, String ordre){
		
		ArrayList<Patient> alp = new DAO_patient().getAllPatient();
		
		// Sorting
		new Sort().sort(alp, tri, ordre);
		
		return alp;
	}
	
	// Ajout patient non existant
	public void ajoutNouveauPatient(int id, String nom, String prenom){
		Patient p=new Patient(id, nom, prenom);
		lp.add(p);
		new DAO_patient().createPatient(p);

	}

	// Afficher la file d'attente
	public String afficherFile(){
		return lp.toString();
	}

	// Afficher le premier patient de la FiFo
	public String afficherProchainPatient(){
		if(lp.size() > 0)
			return lp.getFirst().toString();
		return "Aucun patient dans la file d'attente";
	}

	// Afficher toutes les visites pour un patient
	public String afficherPatientById(int id){
		return (new DAO_visite().getAllVisiteByIdPatient(id)).toString();
	}

	// Afficher toutes les visites de tous les patients
	public String afficherToutesVisites(){
		return (new DAO_visite().getAllVisite()).toString();
	}
	
	// Afficher l'historique des visites
	public String historiqueVisites(){
		return historique.toString();
	}
	
	// Affiche l'historique des visites d'un patient
	public ArrayList<Visite> historiqueVisites(Patient p){
		return historique.get(p);
	}
	
	// Serialisation file attente en XML
	public void sauvegarderFileAttente(){
		// Creation des dossiers si non existants
		File d=new File("c://tmp/");
		if(!d.exists())
			d.mkdirs();
		// Creation du fichier
		File f = new File(d+"/liste.xml");
		
		try{
			FileOutputStream fos=new FileOutputStream(f);
			XMLEncoder oos=new XMLEncoder(fos);
			oos.writeObject(this.lp);
			oos.close();
			fos.close();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}	

	// De serialisation file d attente XML
	public void chargerFileAttente(){
		File f=new File("c://tmp/liste.xml");
		if(f.exists())
			try{
				FileInputStream fis=new FileInputStream(f);
				XMLDecoder ois=new XMLDecoder(fis);
				this.lp=(LinkedList<Patient>)ois.readObject();
				ois.close();
				fis.close();
			}
	
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}	

	// Supprime FiFo
	public void nouvelleJournee(){
		this.lp.clear();
	}
	
	// Envoyer un patient en visite dans une salle libre
	public void envoyerPatient(Salle s){
		Patient p=lp.poll();
		if (p!=null)
			s.notifier(p);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.secretaire.toString();
	}
	
}
