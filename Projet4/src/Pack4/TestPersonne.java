package Pack4;

public class TestPersonne {

	public static void main(String[] args) {
		
		//test();
		//test2();
		test3();
	}

	static void test3(){
		// Test de la methode create()
		Personne pivot= new Personne();
		
		Personne p1 = pivot.create("a","b",10);
		Personne p2 = pivot.create("a","b");
		
		// toString est appelée automatiquement par le print
		System.out.println(p1.toString());
		System.out.println(p2);
	}
	
	static void test2(){
		// Création d'un tableau de 3 cases de type Personne
		Personne[] tab = new Personne[4];
		Personne p1 = new Personne("A","B",10);
		tab[0] = p1;
		
		// Affichage direct de p1
		p1.affiche();
		// Affichage du p1 présent dans le tableau
		tab[0].affiche();
		
		// Remise à null de p1
		p1= null;
		
		// Le p1 du tableau est toujorus présent car copie
		tab[0].affiche();
		
		// On récupère p1 du tableau
		p1 = tab[0];
		p1.affiche();
		
		// On ajoute d'autres personnes directement dans le tableau
		tab[1] = new Personne("C","D",20);
		tab[2] = new Personne("E","F", 30);
		
		// Affichage de chaque personne du tableau.
		// !! Ne pas oublier le if null pour eviter plantage si case vide !!
		for(Personne p:tab)
			if(p!=null)
				p.affiche();
		
		// Version boucle for
		for(int i=0;i<tab.length;i++)
			if(tab[i]!=null)
				tab[i].affiche();
		
		// Utilisation de toString
		System.out.println(p1);
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
