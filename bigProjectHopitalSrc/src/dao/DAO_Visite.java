package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO_Visite {
	
	public static ArrayList<Visite> getAllById(int idPatient){
		ArrayList<Visite> visites = new ArrayList<Visite>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital","root","");
			PreparedStatement ps = conn.prepareStatement("select * from visite where id_patient like ?");
			ps.setInt(1,idPatient);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				Visite v = new Visite();
				v.setIdPatient(rs.getInt("id_patient"));
				v.setDate(rs.getString("date"));
				v.setMedecin(rs.getString("medecin"));
				v.setNumSalle(rs.getInt("num_salle"));
				v.setTarif(rs.getInt("tarif"));
			
				visites.add(v);

			}
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		return visites;
	}
	
	
	
	public static ArrayList<Visite> getAllVisite(){
		ArrayList<Visite> visites = new ArrayList<Visite>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital","root","");
			Statement st = conn.createStatement();
			ResultSet rs= st.executeQuery("select * from visite");
			
			while(rs.next()){
				Visite v = new Visite();
				v.setIdPatient(rs.getInt("id_patient"));
				v.setDate(rs.getString("date"));
				v.setMedecin(rs.getString("medecin"));
				v.setNumSalle(rs.getInt("num_salle"));
				v.setTarif(rs.getInt("tarif"));
			
				visites.add(v);

			}
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		return visites;
	}
	
	public static boolean maj(ArrayList<Visite> visites) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital","root","");
			for (Visite v : visites) {
				PreparedStatement ps = conn.prepareStatement("insert into visite(id_patient, date, medecin, num_salle, tarif)"
						+ " values (?, ?, ?, ?, ?)");
				ps.setInt(1,v.getIdPatient());
				ps.setString(2,v.getDate());
				ps.setString(3,v.getMedecin());
				ps.setInt(4,v.getNumSalle());
				ps.setInt(5,v.getTarif());
				ps.executeUpdate();
			}
			return true;
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			return false;
		}
		
	}

}
