package webapp;

public class UserValidation {

	
	public boolean validateUser(String username, String password)
	{
		if(username.equals("pratibha") && password.equals("abcd"))
			return true;
		return false;
	}
}
