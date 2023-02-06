package stringPrograms;
//1.	Java program to enter a sentence and print the words which starting with a vowel
public class StartingWithVowel {

	public static void main(String[] args) {
		String str = "i am ranjit";
		String temp = "";
	       char[] ch = str.toCharArray();
	       		
	        for (int i = 0; i < ch.length; i++) 
	        {	           
	            char character = ch[i];
	            while (i < ch.length && ch[i] != ' ') 	
	            { 
	            	temp = temp+ ch[i]	;
	            	i++;
	            }  
	            
	            if(character=='a' || character=='A' || character=='e' || character=='E' ||
	                    character=='i' || character=='I' || character=='o' || character=='O' ||
	                    character=='u' || character=='U')
	            {
	            	System.out.print(temp+" ");
	            }
	            
	            temp = "";
	        }
	        
	}

}
