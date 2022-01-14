package com.aishwarya.lab2;

public class JournalPaper extends WrittenItem {
	private int yearPublished;

	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int yearPublished) {
		super(identificationNumber, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	

	

}
