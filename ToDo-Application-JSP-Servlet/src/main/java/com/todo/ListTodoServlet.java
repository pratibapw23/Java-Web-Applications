package com.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo.do")
public class ListTodoServlet extends HttpServlet{

	TodoService todoservice=new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", todoservice.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/todolistpage.jsp").forward(request, response);
	}
	
}
