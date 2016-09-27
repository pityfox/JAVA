package DAO;

import java.sql.*;
import java.util.ArrayList;

public class DAO_patient {
	public DAO_patient(){
		
	}
	
	// Ajout patient à la BDD
	public void createPatient(Patient p){
		try{
			Connection conn = new DAO_DBConnect().DBConnect();
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO patient (id, nom, prenom) VALUES (?,?,?)");
			pst.setInt(1,p.getId());
			pst.setString(2, p.getNom());
			pst.setString(3, p.getPrenom());
			
			pst.executeUpdate();
			
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Patient> getAllPatient(){
		ArrayList<Patient> al = new ArrayList<Patient>();
		try{
			Connection conn = new DAO_DBConnect().DBConnect();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM patient");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
				al.add(new Patient(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom")));
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return al;
	}
	
	public Patient getPatientById(int id){
		Patient p = null;
		try{
			Connection conn = new DAO_DBConnect().DBConnect();	
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM patient WHERE id=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
				p = new Patient(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return p;
			
	}
}
