package com.aishwarya;

import java.util.Scanner;

public class Execise5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int	n= scan.nextInt();
System.out.println( "The Cube is: "+Execise5.cubeOfDigit(n));
		}

	public static int cubeOfDigit(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) 
			sum += i*i*i;
			return sum; 
		
	}
}
