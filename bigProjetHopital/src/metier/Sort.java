package metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import DAO.Patient;

public class Sort {
	public Sort(){
		
	}
	
	public void sort(ArrayList<Patient> alp, String tri, String ordre){
		if(tri.equals("nom") || tri.equals("2")){
			if(ordre.equals("asc") || ordre.equals("1")){
				Collections.sort(alp, new Comparator<Patient>(){
			        @Override
			        public int compare(Patient alp1, Patient alp2)
			        {
			
			            return  alp1.getNom().compareToIgnoreCase(alp2.getNom());
			        }
			    });
			}else{
				Collections.sort(alp, new Comparator<Patient>(){
			        @Override
			        public int compare(Patient alp1, Patient alp2)
			        {
			
			            return  alp2.getNom().compareToIgnoreCase(alp1.getNom());
			        }
			    });
			}
		}else{
			if(ordre.equals("asc") || ordre.equals("1")){
				Collections.sort(alp, new Comparator<Patient>(){
			        @Override
			        public int compare(Patient alp1, Patient alp2)
			        {
			
			            return  alp1.getId() - alp2.getId();
			        }
			    });
			}else{
				Collections.sort(alp, new Comparator<Patient>(){
			        @Override
			        public int compare(Patient alp1, Patient alp2)
			        {
			
			            return  alp2.getId() - alp1.getId();
			        }
			    });
			}
		}
		
	}
}
