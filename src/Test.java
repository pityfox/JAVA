import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("STFU");
//		Scanner lol=new Scanner(System.in);
//		String entree=lol.nextLine();
//		System.out.println(entree);
		
		// Afficher le max entre deux nombres
		//testConditionTernaire(saisirNombre(),saisirNombre());
		
		// Afficher si le nombre est pair ou impair
		//testOddEven(saisirNombre());
		
		// Tests Switch Case Jour de la semaine
		//testSwitchCase(saisirNombre());
		
		// Affichage Tableau
		//testAfficheTableau(saisirNombre("largeur"),saisirNombre("longueur"),saisirChar("caractere"));
		
		// Test Jeu Aléatoire
		testJeuAleatoire();
	}
	
	static int saisirNombre(String demande) {
		System.out.println("Entrer un nombre pour " + demande);
		Scanner saisie=new Scanner(System.in);
		int nbr = saisie.nextInt();
		return nbr;
		
	}
	
	static String saisirChar(String demande) {
		System.out.println("Entrer un nombre pour " + demande);
		Scanner saisie=new Scanner(System.in);
		String a = saisie.nextLine();
		return a;
		
	}
	
	static void testConditionTernaire(int a, int b) {
		System.out.println("Le max entre " + a + " et " + b + " est " + ((a>b)?a:b));
	}

	static void testOddEven(int a){
		System.out.println(a + " Est un nombre " + ((a%2 == 0)?"pair":"impair"));
	}
	
	static void testSwitchCase(int a){
		switch(a){
		case 1: System.out.println("Lundi");break;
		case 2: System.out.println("Mardi");break;
		case 3: System.out.println("Mercredi");break;
		case 4: System.out.println("Jeudi");break;
		case 5: System.out.println("Vendredi");break;
		case 6: 
		case 7: System.out.println("Weekend");break;
		default: System.out.println("Il n'y a que 7 jours dans la semaine");break;
		}
	}
	
	static void testAfficheTableau(int largeur, int longueur, String caractere){
		for(int row = 0; row < largeur; row++){
			for (int col = 0; col < longueur; col++){
				System.out.print(caractere + "\t");
			}
			System.out.println("");
		}
	}
	
	static void testJeuAleatoire(){
		Random R = new Random();
		int nb = R.nextInt(10);
		int tentatives = 0;
		int guessNb;
		
		do {
			tentatives++;
			System.out.println("Essai #"+tentatives+" - Entrez un nombre entre 1 et 10 :");
			Scanner saisie = new Scanner(System.in);
			guessNb = saisie.nextInt();
			if (guessNb > nb)System.out.println("C'est moins !");
			else if (guessNb < nb)System.out.println("C'est plus !");		
		}
		while(nb != guessNb);
		System.out.println("Vous avez trouvé en " + tentatives + " essais");
	}
}
