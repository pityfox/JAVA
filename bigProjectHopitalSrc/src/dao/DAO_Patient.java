package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAO_Patient {
	
	public static Patient getPatientById(int id){
		Patient p = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital","root","");
			PreparedStatement ps = conn.prepareStatement("select * from patient where id like ?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				p = new Patient();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("Nom"));
				p.setPrenom(rs.getString("Prenom"));
				

			}
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		return p;
	}
	
	
	public static void createPatient(Patient p) {

		ArrayList<Patient> patients = new ArrayList<Patient>();
		
		try {
			java.sql.Connection connect = null;
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "");
			java.sql.PreparedStatement ps = connect.prepareStatement("insert into patient VALUES (?, ?, ?)");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Le patient a bien été créée");
	}

}
