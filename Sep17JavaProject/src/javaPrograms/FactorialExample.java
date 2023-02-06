package javaPrograms;

public class FactorialExample
{  
	 public static void main(String args[])
	 {  	
		  //5! = 5*4*3*2*1 = 120
		 
		  int fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(int i=1;i<=number;i++)
		  {    
		      fact=fact*i; 
		     // System.out.println(fact);
		  }    
		  System.out.println("\nFactorial of "+number+" is: "+fact);    
	 }  
}  