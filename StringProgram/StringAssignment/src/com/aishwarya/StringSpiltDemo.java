package com.aishwarya;

import java.util.Arrays;

public class StringSpiltDemo {
	public static void main(String[] args) {
		 String []Test =mySplit("ab#cd#efg#", "#");
		 System.out.println(Arrays.toString(Test));
		 
	}
		 public  static String[] mySplit(String stringToBeBroken,String delimiter){
			 
			String []storeSpilt =new String[stringToBeBroken.length()];
			char compare1,compare2;
			int counter=0;
			
			for (int i = 0; i < stringToBeBroken.length(); i++) {
				storeSpilt[i]="";
			}
			for (int i = 0; i < stringToBeBroken.length(); i++) {
				compare1=stringToBeBroken.charAt(i);
				compare2 =delimiter.charAt(0);
				
				if(!(compare1 == compare2)) {
					storeSpilt[counter] +=""+stringToBeBroken.charAt(i);
				}
					else {
						counter++;
						storeSpilt[counter]=""+stringToBeBroken.charAt(i);
						counter++;
						
					}
				}
			return storeSpilt;
			}
}
