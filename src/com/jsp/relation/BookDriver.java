package com.jsp.relation;

public class BookDriver {

	public static void main(String[] args) {
		Book b1=new Book("Intro of java",5000);
		b1.setAuthor(new Author("James Ghosling",50));
		b1.getAuthor().setAddress(new Address(05,"Vashi","Navi Mumbai","Maharashtra"));
		b1.printBook();

	}

}
