package packFood;

import java.util.Scanner;

// Cette classe est destin�e a des methodes globales
// utilis�es par toutes les autres classes
public class Methods {
	// Saisie de String
	public static String saisirString(String demande) {
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		String a = saisie.nextLine();
		return a;
	}
	
	// Saisie d'un int
	public static int saisirInt(String demande) {
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		int nbr = saisie.nextInt();
		return nbr;
	}
	
	// Saisie d'un Long
	public static long saisirLong(String demande) {
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		long nbr = saisie.nextLong();
		return nbr;
	}
	
	// Saisie d'un bool�en
	public static boolean saisirBool(String demande){
		System.out.println(demande);
		Scanner saisie=new Scanner(System.in);
		boolean nbr = saisie.nextBoolean();
		return nbr;
	}
}
