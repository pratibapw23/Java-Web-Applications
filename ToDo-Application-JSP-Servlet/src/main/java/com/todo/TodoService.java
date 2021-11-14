package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos=new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Core Java","Done"));
		todos.add(new Todo("Learn Java Testing-Junit","ToDo"));
		todos.add(new Todo("Java Server side development","In Process"));
		todos.add(new Todo("Hibernate","Done"));
		todos.add(new Todo("Design Patterns","In Process"));
	}
	public List<Todo> getTodos()
	{
		return todos;
		
	}
	public void addtodo(Todo todo)
	{
		todos.add(todo);
	}

}
