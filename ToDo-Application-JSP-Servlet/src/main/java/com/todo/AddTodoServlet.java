package com.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet{

	TodoService todoservice=new TodoService();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String todo=request.getParameter("todo");
		String status=request.getParameter("status");
		todoservice.addtodo(new Todo(todo,status));
		
		response.sendRedirect("/todo.do");
	}
}
