package webapp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertIntoDatabaseDao {
	
	

	public static int  register(User u)
	{
		int count = 0;
		PreparedStatement statement;
		try {
			Connection con=DatabaseConnectionProvider.getConnection();
			statement=con.prepareStatement("insert into user values(?,?,?,?,?)");
			statement.setString(1, u.getId());
			statement.setString(2, u.getFirstname());
			statement.setString(3, u.getLastname());
			statement.setString(4, u.getEmail());
			statement.setString(5, u.getPassword());
			count=statement.executeUpdate();
			System.out.println(count+" "+"rows affected");
		}catch(Exception e) {}
		if(count>0)
			return 1;
		return 0;
		
	}
}
