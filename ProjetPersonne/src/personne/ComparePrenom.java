package personne;

import java.util.Comparator;

public class ComparePrenom implements Comparator<Personne> {
	
	@Override
	public int compare(Personne p1, Personne p2){
		return p1.getPrenom().compareTo(p2.getPrenom());
	}
}
