package packSerial;

import java.io.Serializable;

public class Adresse implements Serializable {
	// Attributs
	private String rue, ville;

	// Getters & Setters
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	// Constructeurs
	public Adresse(){
		
	}
	
	public Adresse(String rue, String ville) {
		this.rue = rue;
		this.ville = ville;
	}
	
	// toString
	public String toString(){
		return rue + " " + ville;
	}
	
}
