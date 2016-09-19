package packHash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
//		testHashMap();
		
		testClient();
	}

	static void testHashMap(){
		HashMap<Integer, String> dico = new HashMap<Integer, String>();
		dico.put(1,"toto");
		dico.put(2,"titi");
		dico.put(3,"toto");
		
		System.out.println(dico.get(1));
		
		System.out.println(dico.keySet());
		System.out.println(dico.values());

		for(int i:dico.keySet())
			System.out.println(i +":"+dico.get(i));
	}
	
	static void testClient(){
		HashMap<Commercial, ArrayList<Client>> dico = new HashMap<Commercial, ArrayList<Client>>();
		
		Client c1 = new Client("SG", 1000, EPole.banque);
		Client c2 = new Client("CA", 2000, EPole.banque);
		Client c3 = new Client("Peugeot", 3000, EPole.auto);
		Client c4 = new Client("Renault", 4000, EPole.auto);
		
		ArrayList<Client> al1 = new ArrayList<Client>();
		al1.add(c1);
		al1.add(c2);
		ArrayList<Client> al2 = new ArrayList<Client>();
		al2.add(c3);
		al2.add(c4);
		
		Commercial com1 = new Commercial(123, "A", "B");
		Commercial com2 = new Commercial(456, "C", "D");
		
		dico.put(com1, al1);
		dico.put(com2, al2);
		
		// Affichage des commerciaux
		for(Commercial com:dico.keySet())
			System.out.println(com);
		System.out.println("Saisir id commercial :");
		int saisie = new Scanner(System.in).nextInt();
		
		// Recherche et comparaison direct: MAL
		// La clef ici est le com en entier...
//		for(Commercial com:dico.keySet())
//			if(com.getId() == saisie)
//				for(Client c:dico.get(com))
//					System.out.println(c);
		
		// Creation d'un commercial "clef" à partir de la saisie
		Commercial X = new Commercial(saisie, "NA", "NA");
		// On récupère la liste de clients avec notre commercial clef
		ArrayList<Client> reponse = dico.get(X);
		for(Client c:reponse)
			System.out.println(c);
		
	}
}
