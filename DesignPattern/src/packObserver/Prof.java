package packObserver;

import java.util.Arrays;

public class Prof {
	// Attributs
	private String nom;
	private int note = 0;
	private Eleve[] eleves = new Eleve[5];
	
	// Setters & Getters
	public int getNote() {
		return note;
	}
	
	public String getNom() {
		return nom;
	}
	
	// Le setNote notifie les eleves avec update
	public void setNote(int note) {
		this.note = note;
		updateAll();
	}

	// Constructeurs
	public Prof(String nom){
		this.nom = nom;
	}
	
	// Méthodes
	// ajout d'un eleve = "Abonnement"
	public void addEleve(Eleve el){
		for(int i=0;i<this.eleves.length;i++){
			if(this.eleves[i] == null){
				this.eleves[i] = el;
				break;
			}
		}
	}
	
	// Notifier les eleves de la note = MAJ de leur note
	private void updateAll(){
		for(Eleve el:this.eleves)
			if(el != null)
				el.update();
	}

	//toString
	public String toString() {
		String rep = " Prof "+nom+"\nEleves :\n";
		for(Eleve el:this.eleves)
			if(el!=null)rep += el.toString()+" ";
		return rep;
	}
	
	
	
}
