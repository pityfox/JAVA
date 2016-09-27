package DAO;

import java.sql.*;
import java.util.ArrayList;

public class DAO_visite {

	public DAO_visite(){
		
	}
	
	// Sauvegarde des visites en BDD
	public void saveAllVisite(ArrayList<Visite> al){
		try{
			Connection conn = new DAO_DBConnect().DBConnect();
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO visite (id_patient, date, num_salle, medecin, tarif) VALUES (?,?,?,?,?)");
			
			for(Visite v:al){
				pst.setInt(1,v.getPatient().getId());
				pst.setString(2, v.getDate());
				pst.setInt(3, v.getNumSalle());
				pst.setString(4, v.getMedecin());
				pst.setInt(5, v.getTarif());
				
				pst.executeUpdate();
			}
			
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// Recuperatio nde toutes les visites de tous les patients
	public ArrayList<Visite> getAllVisite(){
		ArrayList<Visite> al = new ArrayList<Visite>();
		try{
			Connection conn = new DAO_DBConnect().DBConnect();
			
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM visite");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				// Recupération du patient de la bdd avec l'id
				Patient patient = new DAO_patient().getPatientById(rs.getInt("id_patient"));
				// Ajout nouvelle visite dans la liste
				al.add(new Visite(patient, rs.getInt("num_salle"), rs.getString("medecin"), rs.getInt("tarif")));
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return al;
	}
	
	// Recuperation de toutes les visites d'un patient
	public ArrayList<Visite> getAllVisiteByIdPatient(int id){
		ArrayList<Visite> al = new ArrayList<Visite>();
		try{
			// Reuperation du patient de la bdd avec l'id
			Patient patient = new DAO_patient().getPatientById(id);
			
			Connection conn = new DAO_DBConnect().DBConnect();
			
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM visite WHERE id_patient=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
				al.add(new Visite(patient, rs.getInt("num_salle"), rs.getString("medecin"), rs.getInt("tarif")));
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return al;
	}
	
}
