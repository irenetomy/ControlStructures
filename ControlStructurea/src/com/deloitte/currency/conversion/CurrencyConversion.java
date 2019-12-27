package com.deloitte.currency.conversion;
import java.util.Scanner;

public class CurrencyConversion {
	
	public static void main(String[] args)
	{
	int choice,amount;
	System.out.println("Enter your choice : \n1-> INR -> USD\n2-> USD -> INR\n");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	double inr,usd,tot;
	switch(choice)
	{
	case 1:
		System.out.println("Enter amount : ");
		inr=sc.nextDouble();
		tot=inr/71.20;
		System.out.println("Amount in USD : " +tot);
		break;
	
	case 2:
		System.out.println("Enter amount : ");
		usd=sc.nextDouble();
		tot=usd*71.20;
		System.out.println("Amount in INR : " +tot);
		break;
		
	default:	
		System.out.println("Invalid Option");
		
	}
	sc.close();
	}	
	
}
