package stringPrograms;
//5.Java Program to check input string is Palindrome or Not
public class CheckPalindromeString {
	public static void main(String args []) 
	{
		String str = "velocity";
		System.out.println( "input string = " +str);
		String p = "";
   
    for (int i = 0 ;i < str.length();i++ ) 
    {
    	char ch = str.charAt(i); 
    	p = ch+p;     	
    } 
		
    System.out.println("Reverse str = "+p);      
	         
    if (str.equals(p))
    	
    	{
    		System.out.println("\n string is palindrome");
    	}
    else 
    	
    	System.out.println("\n string is  not palindrome");  
	}
}
