package stringPrograms;
//13.Java program to encodes a word into Piglatin
public class EncodesWordIntoPiglatin {	  
static String pigLatinWord(String string)   
{   
	   
	int stringlength = string.length();   
	int index=-1;   
	for (int i=0; i<stringlength; i++)   
	{  
		char ch = string.charAt(i);
		if ((ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'))   
		{   
			index=i;   
			break;   
		}   
	}     
		if(index==-1)   
			return "-1";      
			return string.substring(index) + string.substring(0, index) + "ay";   
}   
	  
	public static void main(String args[])   
		{   
			String plstring1=pigLatinWord("rritter"); //begin with consonant   
 
			if (plstring1=="-1")   
				System.out.println("Pig Latin is not possible, the string must have at least a vowel.");   
			else  
				System.out.println(plstring1);   
	
		}  
}
