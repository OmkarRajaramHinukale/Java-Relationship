package com.jsp.relation;

public class Book {
	private String title;
	private double price;
	private Author author;
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void printBook() {
		
		System.out.println("=========Book==========");
		System.out.println("Book title: "+title);
		System.out.println("Book price: "+price);
		if(author!=null) {
			author.printAuthor();
		}else {
			System.out.println("Author details is not given");
		}
	}
	

}
