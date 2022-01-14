package com.aishwarya;

import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		String userName;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Username :");
		userName= scan.next();
		new Exercise4().stringVal(userName);
		}
	void stringVal(String str) {
		String remainingChar,lastChar;
		String match = "_job";
		remainingChar = str.substring(0,str.length()-4);
		lastChar =str.substring(str.length()-4);
		if(remainingChar.length() >= 8 && lastChar.equals(match)) {
			System.out.println("Username is Valid.");
		}
		else {
			System.out.println("Username is Not Valid.");
		}
	}
 }
	
