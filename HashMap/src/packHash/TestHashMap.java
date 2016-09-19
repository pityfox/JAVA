package packHash;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		testHashMap();
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
}
