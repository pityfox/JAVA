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
		testReverse();
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
	
	// Inverser l'ordre des mots et mise en majuscules
	static void testReverse(){
		String phrase = saisirString("Ecrivez une phrase :");
		String phraseRev = reverse(phrase);
		String phraseRevCap = capitalize(phraseRev);
		System.out.println(phraseRevCap);
	}
	
	// Inverser l'ordre d'un tableau et mise en majuscules
	static String reverse(String str){
		String[] strTab = str.split(" ");
		computeReverse(strTab);
		return String.join(" ", strTab);
	}
	
	static void computeReverse(String[] tab){
		String[] tab2 = new String[tab.length];
		for(int i=0;i<tab.length;i++){
			tab2[tab.length-1-i] = tab[i];
		}
		for(int i=0;i<tab.length;i++){
			tab[i] = tab2[i];
		}
	}
	
	static String capitalize(String str){
		return str.toUpperCase();
	}
}
