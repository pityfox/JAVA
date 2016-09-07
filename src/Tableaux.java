import java.util.List;
import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testTableau();
//		testTableau2();
//		testTableau3();
		System.out.println(testTableau4());
	}
	
	static int saisirNombre(String demande) {
		System.out.println("Entrer un nombre pour " + demande);
		Scanner saisie=new Scanner(System.in);
		int nbr = saisie.nextInt();
		return nbr;
		
	}
	
	static void testTableau(){
		int [] tab = new int[3];
		tab[0] = 10;
		tab[1] = 20;
		tab[2] = 30;
		for(int el:tab){
			System.out.print(el+"\t");
		}
		
	}
	
	static void testTableau2(){
		int taille = saisirNombre("Taille du tableau");
		int[] tab = new int[taille];
		for(int i = 0; i < taille; i++){
			int value = saisirNombre("valeur "+(i+1));
			tab[i] = value;
		}
		System.out.println("Voici les valeurs du tableau :");
		for(int el:tab)System.out.print(el+"\t");
	}

	static void testTableau3(){
		String[] tab= {"lol", "lil", "loul"};
		for(String el:tab)System.out.print(el+"\t");
	}
	
	static int testTableau4(){
		int [] tab = {10, 20, 30, 40};
		int sum = 0;
		for(int el:tab) sum+=el;
		return sum;
	}
}
