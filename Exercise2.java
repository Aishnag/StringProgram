package com.aishwarya;

import java.util.Arrays;

public class Exercise2 {
	public static void main(String args[])
	{
		String s = "aabbbcc";
		
		if (isAlphabaticOrder(s))
		System.out.println("String is Positive String.");
		else
		System.out.println("String is Not Positive String.");
		}

	static boolean isAlphabaticOrder(String s)
		{
			int n = s.length();
		char c[] = new char [n];
		
		for (int i = 0; i < n; i++) {
				c[i] = s.charAt(i);
			}
		
			Arrays.sort(c);
		
			for (int i = 0; i < n; i++)
				if (c[i] != s.charAt(i))
					return false;
				
			return true;	
		}
		
		
		
	}



