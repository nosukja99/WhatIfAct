package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int custID;
	String custFName;
	String custLName;
	double salesAmount;
	String taxCode;
	double totalAmount;
	double taxRate = 0;
	DecimalFormat df = new DecimalFormat("#.00");
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your customer number?");
	custID = scanner.nextInt();

	System.out.println("What is your first name?");
	custFName = scanner.next();
	System.out.println("What is your last name?");
	custLName = scanner.next();
	//scanner.next();

	System.out.println("What is your sales amount?");
	salesAmount = scanner.nextDouble();
       
	System.out.println("What is your Tax code?");
	taxCode = scanner.next();	
	String convertTaxCode=taxCode.toUpperCase();
	if(convertTaxCode.equals("NRM"))
	    taxRate=0.06;
	else if(convertTaxCode.equals("NPF"))
	    taxRate=0;
	else if(convertTaxCode.equals("BIZ"))
	    taxRate=0.045;
	else
	    System.out.println("This Tax code is error.");
	
	totalAmount=salesAmount+salesAmount*taxRate;

	System.out.println("Customer Id: "+custID);
	System.out.println("Customer Name: "+custFName+" "+custLName);
	System.out.println("Sales Amount: $"+df.format(salesAmount));
	System.out.println("Tax Code: "+convertTaxCode);
	System.out.printf("Total Amount Due: $"+"%.2f",totalAmount);
	    
	
    }
}
