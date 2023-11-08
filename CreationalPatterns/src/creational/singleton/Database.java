package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Connection conn; 
	
	
	
	// Construtor Privado, imedindo acesso externos 
	private Database() {
		
	}
	
	public static Connection getConnection() {
		
		if(  conn == null ) {
			try {
				conn = DriverManager.getConnection("asd");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return conn;
		
	}
}
