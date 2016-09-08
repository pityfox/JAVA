import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testV2(creerTableau());
	}
	static int saisirNombre(String demande) {
		System.out.println("Entrer un nombre pour " + demande);
		Scanner saisie=new Scanner(System.in);
		int nbr = saisie.nextInt();
		return nbr;
		
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
	
	static void afficheTableau(int[] x){
		for(int s:x){
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	static int[] doublerTableauV1(int[] x){
		int[] newTab = new int[x.length];
		for(int i=0;i<newTab.length;i++){
			newTab[i] = x[i]*2;
		}
		return newTab;
	}
	
	static void doublerTableauV2(int[] tab){
		for(int i=0;i<tab.length;i++){
			tab[i] = tab[i]*2;
		}
	}
	
	static void testV2(int[] tab){
		afficheTableau(tab);
		doublerTableauV2(tab);
		afficheTableau(tab);
	}
}
