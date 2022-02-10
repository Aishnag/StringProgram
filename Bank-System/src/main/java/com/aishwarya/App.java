package com.aishwarya;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
   
   InsertBankAccount  dao = context.getBean("insertBankAccount",InsertBankAccount.class);
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the Customers Account Number ,AccountName and AccountBalance : ");
   
   Integer accNo = scan.nextInt();
   scan.nextLine();
   String  accName = scan.nextLine();
   Double accBal = scan.nextDouble();
   dao.addNewBankAccount(new Bank(accNo, accName, accBal));
   
   System.out.println(" Customers account added successfully....");

		   
    }
}
