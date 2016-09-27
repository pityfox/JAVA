package DAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
//		listePatients();
//		listeVisites();
//		listeVisites(12);
//		addPatient();
//		addVisite();
//		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
		
	}

	static void listePatients(){
		ArrayList<Patient> al = new DAO_patient().getAllPatient();
		
		for(Patient p:al)
			System.out.println(p);
	}
	
	static void listeVisites(){
		ArrayList<Visite> al = new DAO_visite().getAllVisite();
		
		for(Visite v:al)
			System.out.println(v);
	}
	
	static void listeVisites(int id){
		ArrayList<Visite> al = new DAO_visite().getAllVisiteByIdPatient(id);
		System.out.println(al.toString());
	}
	
	static void addPatient(){
		Patient p = new Patient(999, "jean", "michel");
		new DAO_patient().createPatient(p);
	}
	
	static void addVisite(){
		Patient p = new Patient(999, "jean", "michel");
		ArrayList<Visite> al = new ArrayList<Visite>();
		Visite v = new Visite(p, 53, "troll", 500);
		al.add(v);
		new DAO_visite().saveAllVisite(al);
	}
}
