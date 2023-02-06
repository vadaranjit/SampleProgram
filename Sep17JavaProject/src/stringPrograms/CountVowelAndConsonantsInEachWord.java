package stringPrograms;
//19.Java program to count the number of vowel and consonants in each word of sentence
public class CountVowelAndConsonantsInEachWord {

	public static void main(String[] args) {
		String str = "aeiou i am ranjit";
		String word[]= str.toLowerCase().split(" ");
		int count = 0;
		
		for(int i=0;i<word.length;i++) 
		{
			for(int j = 0;j<word[i].length();j++) 
			{
				if(word[i].charAt(j)=='a'||word[i].charAt(j)=='e'||word[i].charAt(j)=='i'||word[i].charAt(j)=='o'||word[i].charAt(j)=='u')
				{
					count++;
				}
		
			}
			System.out.print("word = "+word[i]);
			System.out.print("\t\tvowel count ="+count);
			System.out.print("\t\tconsonants count ="+(word[i].length()-count)+"\n");
			count=0;
		}

	}

}
