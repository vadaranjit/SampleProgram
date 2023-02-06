package stringPrograms;
//12.Java program to count the double letter sequences word in given string
public class CountTheDoubleLetterSequencesWord 
{
	public static void main(String[] args) 
	{
		String str = "double letter seequences";
		String[] word = str.split(" ");
		
		for(int i=0;i<word.length;i++) 
		{
			for(int j=0;j<word[i].length()-1;j++) 
			{
				if(word[i].charAt(j)==word[i].charAt(j+1)) 
				{
					System.out.println(i+") "+word[i]+" ");
				}
			}
		}

	}

}
