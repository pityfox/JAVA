package testExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;


public class TestExceptions {

	public static void main(String[] args) throws Exception {
//		saisirAge();
//		testDiv();
//		testThrow();
//		testTryCatch();
//		testFinally();
//		throwsException();
//		catchSpecific(3);
		
		// Mieux vaut tester si la saisie est un int
		// plutot que NextInt() qui plantera direct si
		// pas int
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		String str = sc.nextLine();
		if (isNumeric(str)){
			int age = Integer.parseInt(str);
			System.out.println(age);
		}
		else System.out.println("NEIN");
		
	}

	static void saisirAge(){
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Votre age :");
		
		// Test de l'entrée
		try{
			age = sc.nextInt();
			System.out.println("Votre age est " + age);
		}catch(Exception e){
			System.out.println("ERREUR");
		}
		
		System.out.println("Tchô!");
	}
	
	static void testDiv(){
		int n = 0 ;
		int d = 0;
		double res = 0;
		// TEST DES SAISIES
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("saisir numérateur");
			n = sc.nextInt();
			
			sc = new Scanner(System.in);
			System.out.println("saisir denominateur");
			d = sc.nextInt();
			// TEST DIVISION
			try {
				res = div(n,d);
				System.out.println(res);
			}catch (Exception e){
				System.out.println("Division impossible");
			}
		}catch (Exception e){
			System.out.println("Saisie incorrecte");
		}
		
	}
	
	// Retourne le resultat de la division
	static double div(int n, int d){
		return n/d;
	}
	
	// Simuler une exception
	static void testThrow(){
		RuntimeException e = new RuntimeException("toto");
		throw e;
	}
	
	// TryCatch précis sur l erreur Simu exception
	static void testTryCatch(){
		try{
			System.out.println("Avant");
			throw new RuntimeException("toto");
//			System.out.println("Après");
		} catch (RuntimeException e){
			System.out.println("Dans le cache");
		}
	}
	
	// Finally
	static void testFinally(){
		try {
			throw new ArithmeticException("Message d'erreur");
		} catch (ArithmeticException e){
			System.out.println("dans cache");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Tchô!");
		}
	}
	
	// Renvoie la gestion d'excception au parent/ a l'appelant
	static void throwsException() throws Exception {
		Exception x = new Exception("pas bien");
		throw x;
	}
	
	// Catch toutes les exceptions possibles pour avoir une info precise
	static void catchSpecific(int a){
		// Selon le a on envoie une exception differente
		try{
			switch(a){
			case 1: throw new RuntimeException("cas 1");
			case 2: throw new ArithmeticException("cas 2");
			default: throw new Exception("cas default");
			}
		// Puis on catch tout
		}catch (ArithmeticException e){
			System.out.println(e);
		}catch (RuntimeException e){
			System.out.println(e);
		}catch (Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Tchô!");
		}
	}
	
	//Test si la string est un int
	static boolean isNumeric(String s){
		boolean b = true;
		try{
			Integer.parseInt(s);
		}catch (Exception e){
			b=false;
		}
		return b;
	}
}



