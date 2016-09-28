package utilisateur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import dao.DAO_Patient;
import dao.Patient;

public class Secretaire {
	private String nom;
	private LinkedList<Patient> fileDAttente;
	
	public Secretaire () {
		this.fileDAttente = new LinkedList<Patient>();
		this.nom = "";
	}
	
	public Secretaire (String nom) {
		this();
		this.nom = nom;
	}

	public String getNom () {
		return nom;
	}

	public void setNom (String nom) {
		this.nom = nom;
	}

	public LinkedList<Patient> getFileDAttente () {
		return fileDAttente;
	}

	public void setFileDAttente (LinkedList<Patient> fileDAttente) {
		this.fileDAttente = fileDAttente;
	}

	@Override
	public String toString () {
		String res = "Secretaire " + nom + "\n";
		Iterator<Patient> i = fileDAttente.iterator();
		while (i.hasNext())
			res += i.next().toString();
		return res;
	}
	
	public String afficherFile () {
		String res = "Liste des patients dans la salle d'attente:\n";
		ListIterator<Patient> i = fileDAttente.listIterator();
		while (i.hasNext())
			res += i.next().toString();
		return res;
	}
	
	public void addPatient (Patient p) {
		if (DAO_Patient.getPatientById(p.getId()) == null)
			DAO_Patient.createPatient(p);
		fileDAttente.add(p);
	}
	
	public void envoyerPatient (Salle s) {
		Patient p = fileDAttente.poll();
		if (p != null)
			s.recevoirPatient(p);
	}
	
	public boolean saveFileDAttente () {
		try {
			FileOutputStream f = new FileOutputStream(new File("fileDAttente"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(fileDAttente);
			o.close();
			f.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadFileDAttente () {
		File file = new File("fileDAttente");
		try {
			FileInputStream f = new FileInputStream(file);
			ObjectInputStream o = new ObjectInputStream(f);
			fileDAttente = (LinkedList<Patient>) o.readObject();
			o.close();
			f.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void nouvelleJournee () {
		fileDAttente.clear();
	}

}
