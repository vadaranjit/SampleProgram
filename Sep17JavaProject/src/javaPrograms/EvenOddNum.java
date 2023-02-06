package javaPrograms;
import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Number");
		 int i = sc.nextInt();
		 String x = (i%2==0)?"Even Number":"Odd Number";
		 System.out.print(i+" is "+x);

	}

}
