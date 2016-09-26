package persistanceORM;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws Exception{
//		testGetAllPatient();
		testGetPatientById(12);
	}
	
	static void testGetAllPatient() throws Exception{
		ArrayList<Patient> al = new DAO_Patient().getAllPatient();
		for(Patient p:al)
			System.out.println(p);
	}
	
	static void testGetPatientById(int id) throws Exception{
		ArrayList<Patient> al = new DAO_Patient().getPatientById(id);
		for(Patient p:al)
			System.out.println(p);
	}

}
