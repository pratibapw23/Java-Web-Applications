package webapp;

public class UserValidationService {
	
	public static boolean isUserValid(String username, String password)
	{
		if(username.equals("username") && password.equals("password"))
			return true;
		return false;
	}

}
