package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.Todo;
import com.todo.TodoService;

@WebServlet(urlPatterns = "/delete-toto.do")
public class DeleteTodoServlet extends HttpServlet{
	
	private TodoService todeoservice=new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String todo=request.getParameter("todo");
		String status=request.getParameter("status");
		todeoservice.deteletodo(new Todo(todo,status));
		
		response.sendRedirect("/todo.do");
	}

}
