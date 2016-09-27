package presentation;

import java.util.Scanner;

import DAO.DAO_patient;
import DAO.Patient;
import metier.Hopital;
import metier.Salle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuPrincipal();

	}

	public static void menuPrincipal(){
		Hopital h=Hopital.getInstance("Pompidou");
		Scanner sc=new Scanner(System.in);
		int reponse=0;
		do{
			System.out.println("Bienvenue à l'hôpital "+h);
			System.out.println("1. Interface Patient");
			System.out.println("2. Interface Secrétaire");
			System.out.println("3. Interface salle1");
			System.out.println("4. Interface salle2");
			System.out.println("0. Quitter");
			System.out.println("\nEntrez votre choix");
			reponse=sc.nextInt();
			switch (reponse){
			case 1: interfacePatient();
			break;
			case 2: interfaceSecretaire();
			break;
			case 3:
				interfaceSalle(1);
				break;
			case 4:
				interfaceSalle(2);
				break;
			}
		}

		while(reponse!=0);


	}

	public static void interfacePatient(){
		Hopital h=Hopital.getInstance("Pompidou");
		Scanner sc=new Scanner(System.in);
		int reponse = 0;
		
		System.out.println("Entrez votre identifiant :");
		reponse = sc.nextInt();
		
		Patient p = new DAO_patient().getPatientById(reponse);
		
		do{
			System.out.println("Bonjour M. " + p.getNom() + " " + p.getPrenom());
			System.out.println("1. Historique de vos Visites");
			System.out.println("0. Quitter");
			
			reponse = sc.nextInt();
			
			switch(reponse){
			case 1: System.out.println(h.historiqueVisites(p));
			break;
			}
		}while(reponse != 0);
	}
	
	public static void interfaceSecretaire(){
		Hopital h=Hopital.getInstance("Pompidou");
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		int reponse, id=0;
		String prenomPatient, nomPatient="";
		do{
			System.out.println("Interface secrétaire");
			System.out.println("1. Liste des patients");
			System.out.println("2. Rajouter un patient");
			System.out.println("3. Sauvegarder la file d'attente");
			System.out.println("4. Charger la file d'attente");
			System.out.println("5. Nouvelle journée");
			System.out.println("6. Afficher l'état de la file d'attente");
			System.out.println("7. Afficher le prochain patient");
			System.out.println("8. Afficher les visites d'un patient");
			System.out.println("9. Afficher toutes les visites");
			System.out.println("10. Afficher l'historique de toutes les visites");
			System.out.println("0. Quitter");
			System.out.println("\nEntrez votre choix");
			reponse=sc.nextInt();
			switch (reponse){
			case 1:
				Scanner scTri = new Scanner(System.in);
				Scanner scOrdre = new Scanner(System.in);
				System.out.println("Par 1:ID, 2:Nom");
				String tri = scTri.nextLine();
				System.out.println("Par 1:Asc, 2:Desc");
				String ordre = scOrdre.nextLine();
				System.out.println(h.listerPatients(tri, ordre));
				break;
			case 2:
				System.out.println("Entrer l'id du patient");
				id=sc2.nextInt();
				if(!h.ajoutPatientExistant(id)){
					System.out.println("Entrer le nom du patient");
					prenomPatient=sc3.nextLine();
					System.out.println("Entrer le prenom du patient");
					nomPatient=sc3.nextLine();
					h.ajoutNouveauPatient(id, nomPatient, prenomPatient);
				}
				break;
			case 3:
				h.sauvegarderFileAttente();
				break;
			case 4:
				h.chargerFileAttente();
				break;
			case 5:
				h.nouvelleJournee();
				break;
			case 6:
				System.out.println(h.afficherFile());
				break;
			case 7:
				System.out.println(h.afficherProchainPatient());
				break;
			case 8:
				System.out.println("Entrer l'id du patient");
				id=sc2.nextInt();
				System.out.println(h.afficherPatientById(id));
				break;
			case 9:
				System.out.println(h.afficherToutesVisites());
				break;
			case 10:
				System.out.println(h.historiqueVisites());
				break;
			}
		}

		while(reponse!=0);
	}

	public static void interfaceSalle(int i){
		Hopital h=Hopital.getInstance("Pompidou");
		Scanner sc=new Scanner(System.in);
		int reponse=0;
		do{
			System.out.println("Interface Salle "+i);
			System.out.println("1. Afficher l'état de la file d'attente");
			System.out.println("2. Afficher la liste en cours des visites");
			System.out.println("3. Sauvegarder dans la BDD la liste des visites");
			System.out.println("4. Rendre la salle disponible");
			System.out.println("5. Quitter");
			System.out.println("\nEntrez votre choix");
			reponse=sc.nextInt();
			switch (reponse){
			case 1: System.out.println(h.getSalle(i).afficherFile());
			break;
			case 2:
				System.out.println(h.getSalle(i).afficherListe());
				break;
			case 3:
				h.getSalle(i).saveDB();
				break;

			case 4:
				h.getSalle(i).salleDispo();
				break;
			}
		}

		while(reponse!=5);
	}

}
