package com.aishwarya.lab2;

public class WrittenItem  extends Item{
	
	private String author;
	
 public String getAuthor() {
		return author;
		}

	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
	super(identificationNumber, title, numberOfCopies);
	this.author = author;
}

	public void setAuthor(String author) {
		this.author = author;
		}

	}

