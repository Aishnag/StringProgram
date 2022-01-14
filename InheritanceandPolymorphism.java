package com.aishwarya.lab2;

public class InheritanceandPolymorphism {
	

	public static void main(String[] args) {
Video videos=new Video(250, "Wings Of Fire", 2000, "A.P.J", "Novel", 2010);
       System.out.println(videos.getidNum());
       System.out.println(videos.getTitle());
       System.out.println(videos.getCopies());

		Book book=new Book(12, "The Wish",3,"Nicholas");
		System.out.println(book.getidNum());
		System.out.println(book.getTitle());
		System.out.println(book.getCopies());

	}

}
