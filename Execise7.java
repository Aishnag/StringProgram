package com.aishwarya;

import java.util.Arrays;

public class Execise7 {
	 public static void main(String[] args)
	    {
	        int [] arr = {23, 10, 33, 40, 50};
	        Arrays.sort(arr);
	        reverse(arr, arr.length);
	    }

	 static void reverse(int a[], int n)
	    {
	        int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            b[j - 1] = a[i];
	            j = j - 1;
	        }
	  
	        
	        System.out.println("Reversed array is: \n");
	        for (int k = 0; k < n; k++) {
	            System.out.println(b[k]);
	        }
	    }
	  
	   

	}


