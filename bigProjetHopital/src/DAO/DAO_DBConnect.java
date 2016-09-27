package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO_DBConnect {
	// Conexion à la BDD
	public Connection DBConnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
