package com.aishwarya;

public class Exercise10 {
	public static int calculateDifference(int n){
	     
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	    
	      int sumN = (n * (n + 1)) / 2;
	     
	      int squareSumN = sumN * sumN;
	     
	      return Math.abs(sumSquareN - squareSumN);
	   }
	   public static void main(String args[]){
	      int n = 3;
	      System.out.println(" Enter The Number: " + n);
	      System.out.println("Difference: " + calculateDifference(n));
	   }

}
