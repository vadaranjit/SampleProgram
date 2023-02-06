package stringPrograms;
//11.Java program to input a string in uppercase and print the frequency of each character
public class PrintFrequencyOfEachCharacter {

	public static void main(String[] args) 
	{
		String str = "java and manual";
		String s= str.toUpperCase();
		int count = 0;
		System.out.println("Frequency Of Each Character");
		
			for(char j='A'; j <= 'Z' ;j++) 
			{
				for(int i = 0;i<s.length();i++) 
				{
					if(j==s.charAt(i)) 
					{
						count++;
					}
					
				}
				
				if(count > 0)
				{
					System.out.println("Char "+j+" = " + count);
					count = 0;
				}
			}

	}

}
