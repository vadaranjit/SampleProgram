package javaPrograms;

import java.util.Scanner;

public class CheckNumberIsNegativeOrPositive
{
	public static void main(String[] args)   
	{  
		int num;
	      System.out.println("Enter Number :: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt(); 
	if(num>0)  
	{  
	System.out.println("The number is positive.");  
	}  
	else if(num<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	else  
	{  
	System.out.println("The number is zero.");  
	}  
	
	} 

}
