import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testV2(creerTableau());
		
		// Méthodes imbriquées
		//test1();
		
		// Retourner plus d'une valeur, oupas
		//testRetour();
		
		// Modification de Strings
		//testReverse();
		
		// VarArgs et VarObjects dans une methode
		//int[] tab = creerTableau();
		//affiche(1,2,12,48,"lol",true,1.2, tab);
		
		// Récursivité: Factoriel et Fibonacci
		//System.out.println(facto(16));
		//System.out.println(fibonacci(25));
		
		// simulateur de crédit
		simulateurCredit();
	}
	
	// Saisie d'une chaine de caractere
	static String saisirString(String demande) {
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		String a = saisie.nextLine();
		return a;
	}
	
	// Saisie d'un entier
	static int saisirNombre(String demande) {
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		int nbr = saisie.nextInt();
		return nbr;
	}
	
	// Saisie d'un booléen
	static boolean saisirBool(String demande){
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		boolean nbr = saisie.nextBoolean();
		return nbr;
	}
	
	// Creer un tableau de val random en saisissant sa taille
	static int[] creerTableau(){
		int taille = saisirNombre("Taille du tableau :");
		int[] tab = new int[taille];
		for(int i=0; i<taille; i++) {
			Random R = new Random();
			int nb = R.nextInt(100);
			tab[i]=nb;
		}
		return tab;
	}
	
	// Affiche le contenu d'un tableau
	static void afficheTableau(int[] x){
		for(int s:x){
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	// Double les valeurs d'un tableau dans un nouveau
	static int[] doublerTableauV1(int[] x){
		int[] newTab = new int[x.length];
		for(int i=0;i<newTab.length;i++){
			newTab[i] = x[i]*2;
		}
		return newTab;
	}
	
	// Double les valeurs d'un tableau directement
	static void doublerTableauV2(int[] tab){
		for(int i=0;i<tab.length;i++){
			tab[i] = tab[i]*2;
		}
	}
	
	// Double un tableau en entré et affiche avant apres
	static void testV2(int[] tab){
		afficheTableau(tab);
		doublerTableauV2(tab);
		afficheTableau(tab);
	}
	
	// méthodes imbriquées saisie infos
	static void test1(){
		String nom = saisirString("Votre nom :");
		String prenom = saisirString("Votre prénom :");
		int age = saisirNombre("Votre âge :");
		boolean homme = saisirBool("Homme?");
		String nomComplet = test2(nom, prenom, homme);
		String reponse = "Bonjour ";
		reponse += test3(nomComplet, age);
		System.out.println(reponse);
	}
	
	// Concaténation
	static String test2(String nom, String prenom, Boolean homme){
		return ((homme)?"Mr":"Mme")+" "+prenom+" "+nom;
	}
	
	// Concaténation et booleen en test ternaire
	static String test3(String nomComplet, int age){
		String etat="";
		if(age >= 18){
			etat="vous êtes majeur";
		} else {
			etat="vous êtes mineur";
		}
		
		return nomComplet+" "+age+" ans, "+etat+".";
	}
	
	// Saisie 2 val et affiche somme et difference
	static void testRetour(){
		int val1 = saisirNombre("Valeur 1:");
		int val2 = saisirNombre("Valeur 2:");

		int[] tab = new int[4];
		tab[0] = val1;
		tab[1] = val2;
		compute(tab);
		System.out.println("Somme : "+tab[2]);
		System.out.println("Différence : "+tab[3]);
	}
	
	// Calcul sum et diff et ajoute au tableau
	static void compute(int[] tab){
		tab[2] = tab[0]+tab[1];
		tab[3] = tab[0]-tab[1];
	}
	
	// Taper phrase, Inverser l'ordre des mots puis mise en majuscules
	static void testReverse(){
		String phrase = saisirString("Ecrivez une phrase :");
		String phraseRev = reverse(phrase);
		String phraseRevCap = capitalize(phraseRev);
		System.out.println(phraseRevCap);
	}
	
	// Inverser l'ordre des mots d'une phrase
	static String reverse(String str){
		String[] strTab = str.split(" ");
		computeReverse(strTab);
		return String.join(" ", strTab);
	}
	
	// Inversion du contenu d un tableau
	static void computeReverse(String[] tab){
		String[] tab2 = new String[tab.length];
		for(int i=0;i<tab.length;i++){
			tab2[tab.length-1-i] = tab[i];
		}
		for(int i=0;i<tab.length;i++){
			tab[i] = tab2[i];
		}
	}
	
	// Mettre en MAJ
	static String capitalize(String str){
		return str.toUpperCase();
	}
	
	// Methode avec type arguments et nombre indefinis
	static void affiche(Object... x){
		for(Object s:x)System.out.println(s);
	}
	
	// Factorielle de x, recursivite
	static long facto(long x){
		return (x > 1)?x*facto(x-1):1;
	}
	
	// fibonacci rang x, recursivité
	static int fibonacci(int x){
		return (x>1)?fibonacci(x-1) + fibonacci(x-2):x;
	}
	
	// Simulateur de crédit
	static void simulateurCredit(){
		String nom = saisirString("Nom :");
		String prenom = saisirString("Prénom :");
		int age = saisirNombre("Age :");
		int salaire = saisirNombre("Salaire Mensuel :");
		
		int montant = calculMontant(age, salaire);
		
		System.out.println(montant);
	}
	
	// PArsing regles et calcul montant
	static int calculMontant(int age, int salaire){
		String regle = "20-40-15;41-60-20;61-80-25";
		String[] regles = regle.split(";");
		int taux = 0;
		for(String el:regles){
			String decoupe[] = el.split("-");
			int tranches[] = new int[decoupe.length];
			for(int i=0;i<decoupe.length;i++){
				tranches[i] = Integer.parseInt(decoupe[i]);
			}
			if(tranches[0] <= age && age <= tranches[1]){
				taux = tranches[2];
			}
		}
		
		int salaireAn = salaire * 12;
		int montant = salaireAn * taux / 100;
		
		return montant;
	}
}
