package stringPrograms;
//2.	Java Program to Swap first and last character of each words in a Sentence
public class SwapFirstAndLastCharacter {
	public static void main(String[] args)
    {
       String str = "name ranjit"; 
       char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) 
        {	           
            int k = i;
            while (i < ch.length && ch[i] != ' ')
            {                  
            	i++; 
            }  
             
            char temp = ch[k]; 
            ch[k] = ch[i-1]; 
            ch[i-1] = temp;      
        }
        
        System.out.println(ch);
    }
}
