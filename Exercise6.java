package com.aishwarya;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String :");
	String str= scan.nextLine();
	char charArray[] = str.toCharArray();
	Arrays.sort(charArray);
	System.out.println(new String(charArray));
}
}
