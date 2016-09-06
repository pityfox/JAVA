import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {

	public static void main(String[] args) {
		menu();
		// Afficher le max entre deux nombres
		//testConditionTernaire(saisirNombre(),saisirNombre());
		
		// Afficher si le nombre est pair ou impair
		//testOddEven(saisirNombre());
		
		// Tests Switch Case Jour de la semaine
		//testSwitchCase(saisirNombre());
		
		// Affichage Tableau
		//testAfficheTableau(saisirNombre("largeur"),saisirNombre("longueur"),saisirChar("caractere"));
		
		// Test Jeu Aléatoire
		//testJeuAleatoire();
	}
	
	static void menu(){
		int nb = -1;
		while(!(0<=nb && nb<=5)){
			System.out.println("Liste des Jeux");
			System.out.println("=========================");
			System.out.println("1: Max entre deux nombres");
			System.out.println("2: Pair ou Impair");
			System.out.println("3: Jour de la semaine");
			System.out.println("4: Tableau");
			System.out.println("5: Jeu Aléatoire");
			System.out.println("0: Quitter\n");
			
			System.out.println("Choisissez un jeu :");
			Scanner saisie = new Scanner(System.in);
			nb = saisie.nextInt();
			
			switch(nb){
			case 0: System.out.println("Exit");break;
			case 1: testConditionTernaire(saisirNombre("premier nombre"),saisirNombre("dexième nombre"));break;
			case 2: testOddEven(saisirNombre("le fun"));break;
			case 3: testSwitchCase(saisirNombre("jour de la semaine"));break;
			case 4: testAfficheTableau(saisirNombre("largeur"),saisirNombre("longueur"),saisirChar("caractere"));break;
			case 5: testJeuAleatoire();break;
			}
		}
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
