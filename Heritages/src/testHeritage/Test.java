package testHeritage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A mmA = new A();
		mmA.M1();
		
		B mmB = new B();
		// Appel M2 de la Classe B
		mmB.M2();
		// Appel M1 de la classe B h�rit�e de A
		mmB.M1();
		// Appel M4 de la classeB qui appel M1 h�rit�e de la classeA
		mmB.M4();
		
		// A l interieur du package, z est visible/public
		System.out.println(mmA.z);
		mmA.z = 50;
		System.out.println(mmB.z);
		// Affichage du z chang� dans B venant de A
		mmB.M5();
		
		// Redefinitions + surcharge de affiche dans B
		mmA.affiche();
		mmB.affiche();
		mmB.affiche(10);
		
		// SUPER
		mmB.affiche2();
		
		System.out.println(mmA);
		System.out.println(mmB);
	}

}
