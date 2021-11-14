package com.todo;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(Status, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(Status, other.Status) && Objects.equals(name, other.name);
	}

	
	
	

}
