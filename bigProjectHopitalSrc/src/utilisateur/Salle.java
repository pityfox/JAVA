package utilisateur;

import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dao.DAO_Visite;
import dao.Patient;
import dao.Visite;

public class Salle {

	private int numSalle;
	private ArrayList<Visite> listeVisites;
	private String medecin;
	private final static int tarif = 23;
	private Secretaire sec;
	
	public Salle (int numero, String medecin, Secretaire sec) {
		this.numSalle = numero;
		this.medecin = medecin;
		this.sec = sec;
		listeVisites = new ArrayList<Visite>();
	}

	@Override
	public String toString () {
		return "Salle [numSalle=" + numSalle + ", medecin=" + medecin + ", tarif=" + tarif + "]";
	}
	
	public void dispo () {
		sec.envoyerPatient(this);
	}
	
	public void recevoirPatient (Patient p) {
		Visite v = new Visite(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()), p.getId(), medecin, tarif, numSalle);
		listeVisites.add(v);
	}

	public boolean saveListeVisites () {
		boolean bdd = DAO_Visite.maj(listeVisites);
		try {
			FileOutputStream f = new FileOutputStream(new File("listeVisites"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(listeVisites);
			o.close();
			f.close();
			listeVisites.clear();
			return bdd;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadListeVisitesFromFile () {
		File file = new File("listeVisites");
		try  {
			FileInputStream f = new FileInputStream(file);
			ObjectInputStream o = new ObjectInputStream(f);
			listeVisites = (ArrayList<Visite>) o.readObject();
			o.close();
			f.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String afficherFile () {
		return sec.afficherFile();
	}
	
	public String afficherVisites () {
		String res = "Liste des visites:";
		for (int i=0; i<listeVisites.size(); i++) {
			Visite v = listeVisites.get(i);
			res += "\n"+v.getDate()+"\t"+v.getIdPatient()+"\tSalle "+numSalle+"\tMedecin: "+medecin+"\t"+tarif+"€";
		}
		return res;
	}
	
}
