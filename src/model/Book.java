package model;

import java.io.Serializable;

public class Book implements Serializable{
	private String name;

	public Book(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
