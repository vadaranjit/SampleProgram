package javaPrograms;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char x = sc.next().charAt(0);
		 if ((x=='a')||(x=='A')||(x=='e')||(x=='E')||(x=='i')||(x=='I')||(x=='o')||(x=='O')||(x=='u')||(x=='U'))
		 {
			 System.out.println(x+" = Character is VOWEL");
		 }
		 else  
		 {
			 System.out.println(x+" = Character is CONSONANT");
		 }
			 
	}

}
