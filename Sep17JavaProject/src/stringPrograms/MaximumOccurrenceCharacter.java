package stringPrograms;
//25.Java program to find the Maximum Occurrence character in given string
public class MaximumOccurrenceCharacter {

	public static void main(String[] args) 
	{
		String str = "java anddddddd manual";
		String s= str.toUpperCase();
		int count = 0;
		int tcount = 0;
		char temp = 'a';
		
			for(char checkChar='A'; checkChar <= 'Z' ;checkChar++) 
			{
				for(int i = 0;i<s.length();i++) 
				{
					if(checkChar==s.charAt(i)) 
					{
						count++;
					}
					
				}
				
				if(count > 0)
				{	
					if(tcount<count)
					{
						temp = checkChar;
						tcount = count;
					}
					count = 0;
				}
			}
			
			System.out.print("Maximum Occurrence character = ");
			System.out.println(temp+" is Occurred "+ tcount+" times ");
		}
	}
