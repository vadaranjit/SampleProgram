package package3;

public class Example15 {
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
    if (str.equals(p))
    	{
    		System.out.println(" string is palindrome");
    	}
    else 
    
    	System.out.println(" string is  not palindrome");
    
    
  }
  }
