package javaPrograms;

import java.util.Scanner;

public class Factors {
	   public static void main(String[] args) 
	   {
	      int my_input, i;   
	      my_input = 6;
	      System.out.print("The factors of " + my_input + " are: ");
	      
	      for (i = 1; i <= my_input; ++i)
	      {
	         if (my_input % i == 0)
	         {
	            System.out.print(i + " ");
	         }
	      }
	   }
	}
