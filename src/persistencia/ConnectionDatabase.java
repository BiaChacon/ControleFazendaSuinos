package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
	private String user;			
	private String password;			
	private String url;			
	private String driverjdbc;
	private Connection connection;		

	
	public ConnectionDatabase() {
		this.url = "jdbc:h2:~/ControleFazendaSuinos/ControleFazendaSuinos;INIT=runscript from './src/persistencia/createFazendaSuinos.sql'";
		this.user = "admin"; 
		this.password = "admin";
		this.driverjdbc = "org.h2.Driver";
	}
        
	public void dbConnection() {
		try {
			Class.forName(driverjdbc); 
			connection = DriverManager.getConnection(url, user, password);
                        System.out.println("Conectou!");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	
	public void dbConnectionClose() {
		try {
			connection.close();
		} catch (SQLException ex) {
			System.err.println(ex);
			ex.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
}