package stringPrograms;
//9.Java program to check whether the given string is pangram or not
public class CheckStringPangram {
	public static void main(String args[]) 
	{	
		String str = "Abcdefghijklmnopqrstuvwxyz";   	 
		str = str.toLowerCase();  
		boolean check = true; 
		
		for (char ch = 'a'; ch <= 'z'; ch++)   
			{  
				if (!str.contains(String.valueOf(ch)))   
				{  
					check = false;  
					break;		
				}
							 
			} 
		
	if (check)  
		System.out.println("Pangram String");  
	else  
		System.out.println("Not a Pangram String");  
	}  

}

