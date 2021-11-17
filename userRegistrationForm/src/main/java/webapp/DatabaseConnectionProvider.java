package webapp;
import static webapp.DatabaseProvider.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnectionProvider {
	
	private static Connection con=null;
	
	static {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(connectionurl,username,password);
		}catch(Exception e)
		{
			
		}
	}
	public static Connection getConnection()
	{
		return con;
	}

}
