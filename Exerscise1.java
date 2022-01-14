package com.aishwarya;

import java.util.*;
import java.util.StringTokenizer;

public class Exerscise1 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the Integers separated by comma(,):");
		String input =scan.next();
		StringTokenizer str = new StringTokenizer(input,",");
		int sum=0;
		while(str.hasMoreTokens()) {
			int number=0;
			number=Integer.parseInt(str.nextToken());
			System.out.println("Number is:"+number);
			sum+=number;
		}
		System.out.println("Sum of the Integers Is:"+sum);

	}

}
