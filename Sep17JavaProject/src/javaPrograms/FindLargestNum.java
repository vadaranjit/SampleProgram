package javaPrograms;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		System.out.println("Enter Number");
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    if(x>y)
	    	{
	    		if (x>z)
	    		{
	    			System.out.println(x+" is Largest Number");  
	    		}
	    	}
	    
	    else if(y>z)
	    	{
	    		System.out.println(y+" is Largest Number");	    		
	    	}
	    
	    else 
	    	{
	    	System.out.println(z+" is Largest Number");
	    	}
	    
	}

}









