package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
	
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		request.setAttribute("name", request.getParameter("name"));
		
			
		
		String username=request.getParameter("name");
		String password=request.getParameter("password");
		
		if(UserValidationService.isUserValid(username, password))
		{
			request.getRequestDispatcher("/WEB-INF/views/nextpage.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("ErrorMessage", "Wrong Username or Password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		}
			
		

	}
	
	

}