package com.library.repository;

import java.util.List;

public class Book {

	private String id;
	private String name;
	private List<String> author;
	private String printedDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	public String getPrintedDate() {
		return printedDate;
	}
	public void setPrintedDate(String printedDate) {
		this.printedDate = printedDate;
	}
	
}
