package javaPrograms;

public class LcmFind {
	public static void main(String args[]) 
	{
	int a = 54, b = 53, gcd = 1;  
	//finds GCD  
	for(int i = 1; i <= a && i <= b; i++)   
	{  
	 
		if(a % i == 0 && b % i == 0)  	
		gcd = i;  
	
	}  
	  
		int lcm = (a * b) / gcd;   
		System.out.println(lcm);

	}
}