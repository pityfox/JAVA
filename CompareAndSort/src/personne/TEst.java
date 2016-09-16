package personne;

import java.util.Arrays;

public class TEst {

	public static void main(String[] args) {
//		TableauInt();
//		TableauString();
		
		// compareTo implémentée au sein de la classe en question
		TableauPersonne();
		
		// CompareTo implementée à lexterieur de la class en question
		TestComparePrenom();
	}

	// Trie un tableau d'entiers
	static void TableauInt(){
		int[] Tab = {10,20,1,2,3};
		for(int e:Tab)
			Arrays.sort(Tab);
		for(int e:Tab)
			System.out.println(e);
	}
	
	// Trie un tableau de string
	static void TableauString(){
		String[] Tab = {"XX","AA","abc", "123", "xy"};
		for(String s:Tab)
			Arrays.sort(Tab);
		for(String s:Tab)
			System.out.println(s);
	}
	
	// Trie un tableau de personne avec la méthode compareTo implémentée dans la classe Personne
	static void TableauPersonne(){
		Personne[] Tab = {
				new Personne("A","B",10),
				new Personne("X","Y",40),
				new Personne("F","G",5)
			};
		
		for(Personne p:Tab)
			Arrays.sort(Tab);
		for(Personne p:Tab)
			System.out.println(p);
		}
	
	// Trie un tableau Personne avec compare implémentée à l'extérieur de la classe Personne
	static void TestComparePrenom(){
		Personne[] Tab = {
				new Personne("A","B",10),
				new Personne("X","Y",40),
				new Personne("F","G",5)
			};
		
		for(Personne p:Tab)
			Arrays.sort(Tab, new ComparePrenom());
		for(Personne p:Tab)
			System.out.println(p);
	}
}
