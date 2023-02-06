package javaPrograms;

import java.beans.JavaBean;
import java.time.LocalDateTime;

public class TimeAndDate
{
	 public static void main(String[] args)   
	  {      
		 	//local date
	        System.out.println(java.time.LocalDate.now()); 
	        //local time
	        System.out.println(java.time.LocalTime.now());
	        //timeDate
	        System.out.println(java.time.LocalDateTime.now());
	  } 
}