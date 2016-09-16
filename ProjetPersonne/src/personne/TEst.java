package personne;

import java.util.Arrays;

public class TEst {

	public static void main(String[] args) {
//		TableauInt();
//		TableauString();
		
		// compareTo implémentée au sein de la classe en question
//		TableauPersonne();
		
		// CompareTo implementée à lexterieur de la class en question
		TestComparePrenom();
	}

	static void TableauInt(){
		int[] Tab = {10,20,1,2,3};
		for(int e:Tab)
			Arrays.sort(Tab);
		for(int e:Tab)
			System.out.println(e);
	}
	
	static void TableauString(){
		String[] Tab = {"XX","AA","abc", "123", "xy"};
		for(String s:Tab)
			Arrays.sort(Tab);
		for(String s:Tab)
			System.out.println(s);
	}
	
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
