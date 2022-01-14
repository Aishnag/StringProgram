package com.aishwarya.lab2;

public class Item {
	private int idNumber;
	private String title;
	private int numberOfCopies;
	
public Item(int identificaationNumber,String title,int numberOfCopies){
		this.idNumber=identificaationNumber;
		this.title=title;
		this.numberOfCopies=numberOfCopies;
		}
	public int setidNum(int id){
		idNumber = id;
		return id;
		}
	public String setTitle(String str){
		title = str;
		return str;
		}
	public int setNumCopies(int n){
		numberOfCopies = n;
		return n;
		}
	public int getidNum(){
		return idNumber;
		}
	public String getTitle(){
		return title;
		}
	public int getCopies(){
		return numberOfCopies;
		}
	public void checkIn(){
		numberOfCopies = numberOfCopies + 1;
		}
	public void checkOut(){
		numberOfCopies = numberOfCopies - 1;
		}
	public void addItem(int idNumber, String str, int n){
		setidNum(idNumber);
		setTitle(str);
		setNumCopies(n);
		}
	public String toString(){
		return "ID: " +idNumber+ " Title: " +title+ " Number of Copies: " +numberOfCopies;
		}
	public void print(){
		System.out.println("Title: " +title);
		System.out.println("ID: " +idNumber);
		System.out.println("Number of copies: " +numberOfCopies);
		}
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		Item otherItem = (Item) obj;
		return idNumber == otherItem.idNumber && title == otherItem.title && numberOfCopies
		== otherItem.numberOfCopies;
		}
	public void addItem(){
		numberOfCopies++;
		}
}

