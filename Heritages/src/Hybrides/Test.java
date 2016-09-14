package Hybrides;

public class Test {

	public static void main(String[] args) {
		Animal[] Tab = new Animal[5];
		
		// Polymorphisme
		Tab[0] = new Animal();
		Tab[1] = new Chat();
		Tab[2] = new Chien();
		
		for(Animal a:Tab)
			if(a!=null)
				a.affiche();
	}

}
