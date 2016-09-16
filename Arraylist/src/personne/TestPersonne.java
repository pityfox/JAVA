package personne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestPersonne {

	public static void main(String[] args) {
		TrierPersonne();
	}

	static void TrierPersonne(){
		ArrayList<Personne> al = new ArrayList<Personne>();
		al.add(new Personne("X","Y"));
		al.add(new Personne("A","B"));
	
		System.out.println(al);
		
		al.sort(new ComparePrenom());
		
		System.out.println(al);
		
		
	}
}
