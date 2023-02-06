package stringPrograms;
//22.Java program to find the frequency of given word present in string
public class FindTheFrequencyOfGivenWord 
{
	public static void main(String[] args) 
	{
				String str = "java java java and and and manual";
				String[] word= str.split(" ");
				String checkWord = "and";
				int count = 0;
				int oldCount= 0;
				String temp = "";
				System.out.println("Frequency Of Each Word");
				
				for (int i = 0;i<word.length;i++) 
				{
					
							if(word[i].contains(checkWord)) 
							{
								count++;
							}

				}
				
				System.out.println("count of word = "+checkWord+" : "+count);

		}
}