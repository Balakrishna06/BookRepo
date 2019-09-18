package com.nt.book;

public class Book {
int bookId;
String bookName;
public Book(int bookId, String bookName) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
}
public static void main(String[] args) {
	Book b=new Book(10,"bala");
	System.out.println("BookId:"+ b.bookId + "BookName:"+b.bookName);
	
}
}
