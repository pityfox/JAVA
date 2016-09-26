package persistanceORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO_Patient {
	public DAO_Patient(){
		
	}
	
	public ArrayList<Patient> getAllPatient() throws Exception{
		ArrayList<Patient> al = new ArrayList<Patient>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testHopital", "root", "root");
	
		PreparedStatement pst = conn.prepareStatement("SELECT * FROM patient");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
			al.add(new Patient(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom")));
		conn.close();
		
		return al;
	}
	
	public ArrayList<Patient> getPatientById(int id) throws Exception{
		ArrayList<Patient> al = new ArrayList<Patient>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testHopital", "root", "root");
	
		PreparedStatement pst = conn.prepareStatement("SELECT * FROM patient WHERE id=?");
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
			al.add(new Patient(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom")));
		conn.close();
		
		return al;
	}
	
}
