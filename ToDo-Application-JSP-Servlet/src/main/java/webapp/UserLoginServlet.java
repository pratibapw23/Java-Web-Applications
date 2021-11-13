package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.TodoService;

@WebServlet(urlPatterns = "/todo.list")
public class UserLogin extends HttpServlet{
	
	UserValidation userValidationService=new UserValidation();
	TodoService todoservice=new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userValidationService.validateUser(username, password))
		{
			request.setAttribute("username", username);
			request.setAttribute("todos", todoservice.getTodos());
			request.getRequestDispatcher("/WEB-INF/views/todolistpage.jsp").forward(request, response);

		}
		else
		{
			request.setAttribute("ErrorMessage","Something Went Wrong!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}
	}

}
