package stringPrograms;
//7.	Java program to convert first letter of each word in a sentence to uppercase and the remaining letters to lowercase
public class MakeFirstCharUpperCase {
	public static void split()
	{	
		String str = "java and manual WORD";
		String[] temp = str.split(" ");
		String word = "";
		String ch= "";
		String s = "";	
		for (int i = 0; i < temp.length; i++)
		{	 
			ch = ""+temp[i].charAt(0);
			ch = ch.toUpperCase();
			s = ch  + temp[i].substring(1);
			word = word + s +" ";	
		}
		System.out.println("Using Split Method = "+word);
		
	}
	
	public static void normal()
	{
		String str = "java and manual WORD";	 
		String s = "";	
		String word = "";
	    String rev = "";
		char[] ch = str.toCharArray();
	       		
	        for (int i = 0; i < ch.length; i++) 
	        {	           
	            int k = i;	            
	            i++;
	            while (i < ch.length && ch[i] != ' ') 	
	            {    
	                    word = word + ch[i];
	                    i++;
	            }     
	            s = ""+str.charAt(k);	           
	            rev = rev + s.toUpperCase() + word.toLowerCase() +" ";            
	            word = "";            
	           
	        }	
	        	System.out.println("Using Normal Method = "+rev);

	}
	
	public static void main(String[] args) 
		{	
			split();
			normal();
		}
	}