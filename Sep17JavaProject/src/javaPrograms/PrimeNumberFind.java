package javaPrograms;

import java.util.Scanner;

public class PrimeNumberFind {
	public static void main(String args[])
	{    
		
		 Scanner x= new Scanner(System.in);
		 System.out.println("Enter Range = ");
		 
		 int i = x.nextInt();
		 for (int y=1;y<=i;y++)
		 {
			 int count= 0;
				for (int j=1;j<=y;j++)
				 {
					 if(y%j == 0) 
					 	{
						    count++;
					 	}
				 }
					if (count == 2)
						{
					     	System.out.println(y+" = This Number is Prime");
						}
		 }
}
}
