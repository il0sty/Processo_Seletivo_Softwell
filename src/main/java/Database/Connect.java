package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private String url;
	private String user;
	private String password;
	private Connection conn;
	
	public Connect(){
		conn = null;
		url = "jdbc:postgresql://localhost:5432/testsoftwell";
		user = "postgres";
		password = "postgres";

		try {
			
		    conn = DriverManager.getConnection(url, user, password);
		    System.out.println("Conected");
		} catch (SQLException e) {
			System.out.println("Not Conected");
		    System.out.println(e.getMessage());
		}
	}

}
