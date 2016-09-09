package Pack4;

public class TestPersonne {

	public static void main(String[] args) {
		
		test();
		
	}

	static void test(){
//		Personne p1=new Personne();
//		p1.nom="toto";
//		p1.prenom="titi";
//		p1.age=10;
//		
//		System.out.println(p1.nom+" "+p1.prenom+" "+p1.age);
//		
//		Personne p2=new Personne();
//		p2.nom="aa";
//		p2.prenom="bb";
//		p2.age=20;
//		
//		System.out.println(p2.nom+" "+p2.prenom+" "+p2.age);
//		
//		Personne p3=p1;
//		System.out.println(p3.nom+" "+p3.prenom+" "+p3.age);
//
////		p1=null;
////		System.out.println(p1.nom+" "+p1.prenom+" "+p1.age);
//		
//		p3.affiche();
		
		Personne p1 = new Personne();
		p1.affiche();
		
		Personne p2 = new Personne("Boulet");
		p2.affiche();
		
		Personne p3 = new Personne("Jean", "Michel");
		p3.affiche();
		
		Personne p4 = new Personne("Michel", "Blob", 42);
		p4.affiche();
		
		Personne copie = new Personne(p3);
		copie.affiche();
		
	}
}
