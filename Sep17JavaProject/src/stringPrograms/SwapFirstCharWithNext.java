package stringPrograms;
//4.	Java to swap first character of each word with next character
public class SwapFirstCharWithNext {
	
	public static void main(String[] args) 
	{
		String str = "Java And Manual";	        
	       char[] ch = str.toCharArray();
	       		
	        for (int i = 0; i < ch.length; i++) 
	        {	           
	            int k = i;
	            while (i < ch.length && ch[i] != ' ') 	
	            { 
	            	i++;	
	            }        
	            char temp = ch[k];
	            ch[k] = ch[k+1];
	            ch[k+1] = temp;
	        }
	        
	        System.out.println(ch);
}
}