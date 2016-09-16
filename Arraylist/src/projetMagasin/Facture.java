package projetMagasin;

import java.util.ArrayList;

public class Facture {
	private ArrayList<Ligne> lignes = new ArrayList<Ligne>();
	private String nomClient;
	private int prixTotal = 0;
	
	public Facture(String nomClient){
		this.nomClient = nomClient;
	}
	
	public void add(Ligne ligne){
		this.lignes.add(ligne);
		this.prixTotal += ligne.prixLigne;
	}
	
	public String toString(){
		String rep = "\tFacture " + nomClient + "\n";
		rep += "--------------------------------------------\n";
		rep += "Qtté\tArticle\tModele\tPU\tTotal\n";
		rep += "--------------------------------------------\n";
		if(lignes != null)
			for(Ligne l:lignes)
				if (l != null)
					rep += l.toString()+"\n";
		rep += "--------------------------------------------\n";
		rep += "\t\tTotal à payer\t" + prixTotal + "€";
		return rep;
	}
}
