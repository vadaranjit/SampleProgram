package stringPrograms;
//17.Java program to print and count all the palindrom words in input sentence
public class CountAllThePalindromeWords {
	public static void main(String args []) 
	{
		String str = "velocity testing mam ana";
		String word[] = str.split(" ");
		String p = "";
		int count = 0;
		System.out.println("Palindrom words : ");
		
		for(int j= 0;j<word.length;j++) 
		{
   
			for (int i = 0 ;i < word[j].length();i++ ) 
			{
				char ch = word[j].charAt(i); 
				p = ch+p; 
			}       
			
			if (word[j].equals(p))
    		{	
    			count++;
    			System.out.println(count+") "+word[j]);
    		}  
			p = "";
		}
		System.out.println("\nTotal Palindrom words = "+count);	
	}
}
