package stringPrograms;
//18.Java program to remove the specific word from sentence
import java.util.Scanner;
//Java program to remove the specific word from sentence
public class RemoveTheSpecificWord {

	public static void main(String[] args) 
	{
		String str = "Java program to remove the specific word from sentence";
//		Scanner s = new Scanner(System.in);
//		String user = s.nextLine();
		String user = "specific";
		String[] word = str.split(" ");
		String sc="";
		   
	  
		for (int i = 0; i<word.length; i++)
		{                                      
			if(user.equalsIgnoreCase(word[i])) 
				{
				continue;
				} 
			else
				sc = sc + word[i] + " "; 
			
			
			
		}
		System.out.println(sc);
	}

}