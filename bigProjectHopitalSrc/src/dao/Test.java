package dao;

import java.util.ArrayList;

public class Test {
	public static void main (String[] args) {
		
		System.out.println(DAO_Patient.getPatientById(5));

		/*Patient p = new Patient(15,"Evano", "Adrien");
		DAO_Patient.createPatient(p);*/
		
		/*System.out.println(DAO_Visite.getAllById(12));
		System.out.println(DAO_Visite.getAllVisite());
		
		
		ArrayList<Visite> V = new ArrayList<Visite>();
		Visite v1 = new Visite("07/06/15", 12, "toto", 23, 1);
		Visite v2 = new Visite("07/06/15", 20, "titi", 23, 2);
		V.add(v1);
		V.add(v2);
		
		DAO_Visite.maj(V);*/
	}

}
