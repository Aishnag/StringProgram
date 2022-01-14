//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
//sum =3+5=8, diff=3*5=15
package com.aishwarya;

public class Execrise9 {
	static int calculateSum(int N) //
	{ 
		int S1,S2,S3;
		
         S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;   //3,5,6,9,10,12,15,18,20
		 S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;   //98
		 S3 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2; //

		    return S1 + S2 - S3; 
		
	} 

	 
	 public static void main (String[] args) {
	    int N = 14;
	  
System.out.print("Sum of natural number which is divisible by (3,5):"+calculateSum(12)); 
	}

}


