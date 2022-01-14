package com.aishwarya.lab2;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	
	
public Video(int identificationNumber, String title, int numberOfCopies, String director, String genre, int year) {
		super(identificationNumber, title, numberOfCopies);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
