package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register.in")
public class UserRegisterFromServlet extends HttpServlet{
	
	User user;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/UserForm.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message;
		String id=request.getParameter("id");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		user=new User(password,firstname,lastname,email,id);
		user.setId(id);user.setFirstname(firstname);user.setLastname(lastname);user.setEmail(email);user.setPassword(password);
		int status=InsertIntoDatabaseDao.register(user);
		if(status==1)
			message="Registered Successfully!!";
		else
			message="Registration Failed!!";
		request.setAttribute("message",message);
	}

}
