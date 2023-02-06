package stringPrograms;
//8.Java program to check entered word is happy word or not
//this is normal program (logic is diff.) cheack on google
import java.util.Scanner;

public class CheckWordHappyOrNot {

	public static void main(String[] args) 
	{
		String x = "happy";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(x.equalsIgnoreCase(str)) 
			System.out.println("Enterd Word is Happy");
		else 
			System.out.println("Enterd Word is not Happy");
		

	}

}
