package main;

import java.util.ArrayList;
import java.util.Scanner;

import utilisateur.Salle;
import utilisateur.Secretaire;
import dao.DAO_Patient;
import dao.DAO_Visite;
import dao.Patient;
import dao.Visite;

public class Main {

	public static void main(String[] str)
	{
		// saisie clavier de l'id du client
		int idPatient=0;
		String nompatient = "";
		String prenom = "";
		int saisie=0, saisie2=0;
		boolean continu=true;
		boolean continu2=true;

		Secretaire s=new Secretaire("Mme Dupont");
		Salle s1=new Salle(1,"Dr. House",s);
		Salle s2=new Salle(2,"Dr. Maboulle",s);

		do {
			continu=true;
			Salle s3 = s2;
			System.out.println("Bienvenue à l'hopital Drôle de Mort");
			System.out.println("1 - interface secretaire");
			System.out.println("2 - interface salle1");
			System.out.println("3 - interface salle2");
			System.out.println("4 - quitter");
			System.out.print("Entrez votre choix: ");

			boolean bool1 = true;
			while (bool1) try {
				saisie2 = new Scanner(System.in).nextInt();
				if (saisie2 > 0 && saisie2 < 5)
					bool1 = false;
				else
					System.out.print("Votre choix est invalide. Entrez votre choix: ");
			} catch (Exception e) {
				System.out.print("Vous devez saisir un entier. Entrez votre choix: ");
			}
			
			switch (saisie2) {
			case 1:
				do {
					System.out.println("1 - rajouter un patient");
					System.out.println("2 - Sauvegarder la liste d'attente");
					System.out.println("3 - charger la liste d'attente");
					System.out.println("4 - nouvelle journée");
					System.out.println("5 - afficher l'etat de la file d'attente");
					System.out.println("6 - afficher les visites d'un patient");
					System.out.println("7 - afficher toutes les visites");					
					System.out.println("8 - quitter");
					System.out.print("Entrez votre choix: ");
					
					boolean bool2 = true;
					while (bool2) try {
						saisie = new Scanner(System.in).nextInt();
						if (saisie > 0 && saisie < 9)
							bool2 = false;
						else
							System.out.print("Votre choix est invalide. Entrez votre choix: ");
					} catch (Exception e) {
						System.out.print("Vous devez saisir un entier. Entrez votre choix: ");
					}
					
					switch (saisie) {
						case 1:
							System.out.print("Entrez l'id du patient : ");
							boolean bool3 = true;
							while (bool3) try {
								idPatient = new Scanner(System.in).nextInt();
								bool3 = false;
							} catch (Exception e) {
								System.out.print("Vous devez saisir un entier. Entrez votre choix: ");
							}
							Patient p = DAO_Patient.getPatientById(idPatient);
							if (p != null) {
								s.addPatient(p);
								System.out.println("Patient déjà existant en base");
							} else {
								System.out.print("Entrez le nom du patient : ");
								boolean bool4 = true;
								while (bool4) try {
									nompatient = new Scanner(System.in).nextLine();
									bool4 = false;
								} catch (Exception e) {
									e.printStackTrace();
								}
								System.out.print("Entrez le prenom du patient : ");
	
								boolean bool5 = true;
								while (bool5) try {
									prenom = new Scanner(System.in).nextLine();
									bool5 = false;
								} catch (Exception e) {
									e.printStackTrace();
								}
								p = new Patient(idPatient, nompatient, prenom);
								s.addPatient(p);
							}
							break;
						case 2:
							s.saveFileDAttente();
							break;
						case 3:
							s.loadFileDAttente();
							break;
						case 4 :
							s.nouvelleJournee();
							break;
						case 5:
							System.out.println(s.afficherFile());
							break;
						case 6 :
							System.out.print("Entrez l'id du patient: ");
							
							boolean bool6 = true;
							while (bool6) try {
								idPatient = new Scanner(System.in).nextInt();
								bool6 = false;
							} catch (Exception e) {
								System.out.print("Vous devez saisir un entier. Entrez votre choix: ");
							}
							ArrayList<Visite> liste=DAO_Visite.getAllById(idPatient);
							for ( Visite v: liste)
								System.out.println(v.toString());
							break;
						case 7:
							ArrayList<Visite> liste2=DAO_Visite.getAllVisite();
							for ( Visite v: liste2)
								System.out.println(v.toString());
							break;
						case 8:
							System.out.println("Fin du traitement");
							continu = false;
							break;
						}
				} while (continu);				
				break;
			case 2:	
				//salle 1					
				s3=s1;
			case 3:
				do {
					System.out.println("1 - afficher l'état de la file d'attente");
					System.out.println("2 - afficher la liste en cours des visites");
					System.out.println("3 - sauvegarde de la BDD de la liste des visites");
					System.out.println("4 - rendre la salle disponible");
					System.out.println("5 - quitter");
					System.out.print("Entrez votre choix: ");

					boolean bool2 = true;
					while (bool2) try {
						saisie = new Scanner(System.in).nextInt();
						if (saisie > 0 && saisie < 7)
							bool2 = false;
						else
							System.out.print("Votre choix est invalide. Entrez votre choix: ");
					} catch (Exception e) {
						System.out.print("Vous devez saisir un entier. Entrez votre choix: ");
					}
					switch (saisie) {
						case 1:
							System.out.println (s3.afficherFile());
							break;
						case 2:
							System.out.println (s3.afficherVisites());;
							break;
						case 3:
							s3.saveListeVisites();
							break;
						case 4 :
							s3.dispo();
							break;
						case 5:
							System.out.println("Fin du traitement");
							continu = false;
							break;
					}
				} while (continu);
				break;
			case 4:
				continu2=false;
				break;
			}		
		} while(continu2);
	}
}

		
	