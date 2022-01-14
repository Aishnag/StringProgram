package com.aishwarya.lab2;

public class Cd  extends MediaItem{
	private String artist;
	private String genre;
	public Cd(int identificationNumber, String title, int numberOfCopies, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	

}
