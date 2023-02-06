package javaPrograms;

public class CountDigits {

		  public static void main(String[] args)
		  {

		    int count = 0, num = 1000;

		    while (num != 0) 
		    {
		      num /= 10;  // num  = num/10;   
		      count++;
		    }

		    System.out.println("Number of digits: " + count);
		  }
		}
