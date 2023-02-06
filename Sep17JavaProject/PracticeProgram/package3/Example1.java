package package3;

import java.util.Scanner;

public class Example1 {
	
	public int add(int x , int y) 
	{
		int a = x + y;
		return a;
	}
	public int sub(int x , int y) 
	{
		int a = x - y;
		return a;
	}
	public static void main(String args []) {
		Example1 obs = new Example1();
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Select Operation = 1 or 2");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		
		int num = sc.nextInt();
		switch (num) 
		{
		case 1:
			int a = obs.add(num1,num2);
			System.out.println("Addition of "+num1+ " and " +num2+ " is = "+ a);
			break; 
		
		case 2:
			int b = obs.sub(num1,num2);
			System.out.println("Subtraction of "+num1+ " and " +num2+ " is = "+ b);
			break;
		}
		
	}

}
