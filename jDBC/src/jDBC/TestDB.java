package jDBC;

import java.sql.*;

public class TestDB {

	public static void main(String[] args) throws Exception{
//		testConnexion();
//		testRequete();
//		testInsert();
		testRequeteParametre();
	}

	// Connexion a la BDD
	static void testConnexion() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gopen", "root", "root");
		conn.close();
	}
	
	// Recup de donnees
	static void testRequete() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testHopital", "root", "root");
	
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM patient");

		while(rs.next())
			System.out.println(rs.getString("id") + "\t" + rs.getString("nom") + "\t" + rs.getString("prenom"));
		
		conn.close();
	}
	
	// Insertion de donnees
	static void testInsert() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testHopital", "root", "root");
	
		Statement st = conn.createStatement();
		
		st.executeUpdate("INSERT INTO patient (id,nom,prenom) VALUES (10,'toto','titi')");
		
		conn.close();
	}
	
	// Requete préparée, Variables
	static void testRequeteParametre() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testHopital", "root", "root");
	
		PreparedStatement pst = conn.prepareStatement("SELECT * FROM patient WHERE id=?");
		pst.setInt(1,12);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
			System.out.println(rs.getString("id") + "\t" + rs.getString("nom") + "\t" + rs.getString("prenom"));
		
		conn.close();
	}
}
