package com.deloitte;
import java.util.Scanner;

public class SwitchCondition 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		int largest= a>b ? a:b;
		largest= c > largest ?c :largest;
		System.out.println("Largest = "+largest);
		
	}
	
}	
		








