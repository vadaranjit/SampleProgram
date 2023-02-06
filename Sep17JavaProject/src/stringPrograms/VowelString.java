package stringPrograms;
//26. Print number of vowels
import java.util.Scanner;

public class VowelString 
	{
	    public static void main(String args[])
	    {
	        Scanner scanner = new Scanner(System.in);
	 
	        System.out.print("Enter an String : ");
	        String str = scanner.nextLine();
	 
	        int countVowels = countVowels(str);
	        System.out.println("Number of vowels: "+countVowels);
	        scanner.close();
	    }
	 
	    public static int countVowels(String str)
	    {
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++) 
	        	{
	            char character =str.charAt(i);
	            
	            if(character=='a' || character=='A' || character=='e' || character=='E' ||
	                    character=='i' || character=='I' || character=='o' || character=='O' ||
	                    character=='u' || character=='U')
	            	{
	            		count++;
	            	}
	        }
	        return count;
	    }
	}
