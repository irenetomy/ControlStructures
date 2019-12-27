package com.deloitte;
import java.util.Scanner;

public class ControlStructures {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(" A - "+a);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(" B - "+b);
			}
			else
			{
				System.out.println(" C - "+c);
			}
		}
	}

}
