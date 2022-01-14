package com.aishwarya;

public class Exercise12 {

	static boolean checkNumber(int n) 
	{ 
	    if(n==0) 
	    return false; 
	  
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
	       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 
	  
	// Driver Code 
	public static void main(String[] args) 
	{ 
	    if(checkNumber(31)) 
	    System.out.println("Entered number is a power of two."); 
	    else
	    System.out.println("Entered number is not a power of two."); 
	      
	    if(checkNumber(8)) 
	    System.out.println("Entered number is a power of two."); 
	    else
	    System.out.println("Entered number is not a power of two."); 
	} 

}
