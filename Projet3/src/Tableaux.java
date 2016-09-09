import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testTableau();
//		testTableau2();
//		testTableau3();
//		System.out.println(testTableau4());
//		testTableau5();
//		String[] tab={"lol","lil","loul"};
//		afficheTableau(tab);
		
//		int[] tab1 = {1,2,3,4,5,6};
//		int[] tab2 = doublerTableau(tab1);
//		afficheTableau(tab1);
//		afficheTableau(tab2);
		
//		int[] tab1 = creerTableau();
//		int[] tab2 = doublerTableau(tab1);
//		afficheTableau(tab1);
//		afficheTableau(tab2);
		
		// Swap deux variables avec tableau
		int a = saisirNombre("valeur A");
		int b = saisirNombre("valeur B");
		int[] tab = {a,b};
		System.out.println("A: " + a + " B: "+ b);
		swapTableau(tab);
		a = tab[0];
		b = tab[1];
		System.out.println("A: " + a + " B: "+ b);
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
	
	static void testTableau5(){
		int[] tab = creerTableau();
		
		System.out.println("Tableau :");
		for(int el:tab)System.out.print(el+" ");
		int count = 0;
		int seek = saisirNombre("\nelement a rechercher :");
		for(int el:tab){
			if(el == seek)count++;
		}
		System.out.println("L'élément " + seek + " est présent " + count + " fois");
	}
	
	static void afficheTableau(String[] x){
		for(String s:x){
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	static void afficheTableau(int[] x){
		for(int s:x){
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	static int[] doublerTableau(int[] x){
		int[] newTab = new int[x.length];
		for(int i=0;i<newTab.length;i++){
			newTab[i] = x[i]*2;
		}
		return newTab;
	}
	
	static void swapTableau(int[] tab){
		int temp = tab[0];
		tab[0] = tab[1];
		tab[1] = temp;
	}
}
