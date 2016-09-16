package personne;

import java.util.Comparator;

public class ComparePrenom implements Comparator<Personne> {
	
	// Methode compare implémentée l'interface Comparator
	@Override
	public int compare(Personne p1, Personne p2){
		return p1.getPrenom().compareTo(p2.getPrenom());
	}
}
