package com.todo;

public class Todo {
	
	private String name;
	private String Status;

	public Todo(String name,String status) {
		super();
		this.name = name;
		this.Status=status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", Status=" + Status + "]";
	}

	
	
	

}
