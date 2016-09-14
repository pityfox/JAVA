package lazofkize;
import testHeritage.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A mmA = new A();
		mmA.M1();
		
		B mmB = new B();
		// Appel M2 de la Classe B
		mmB.M2();
		// Appel M1 de la classe B héritée de A
		mmB.M1();
		// Appel M4 de la classeB qui appel M1 héritée de la classeA
		mmB.M4();
		
		// A l exterieur du package, z n'est plus visible/private
//		System.out.println(mmA.z);
//		mmA.z = 50;
//		System.out.println(mmB.z);
		// Affichage du z changé dans B venant de A
		mmB.M5();

	}

}
