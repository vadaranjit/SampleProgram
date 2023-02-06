package stringPrograms;
import java.util.Arrays;
//23.Java program to check word or phrase is anagram or not
public class CheckWordOrPhraseAnagramOrNot {

			static boolean areAnagram(char[] str1, char[] str2)
			{
				int n1 = str1.length;
				int n2 = str2.length;

				if (n1 != n2)
				{
					return false;
				}
				Arrays.sort(str1);
				Arrays.sort(str2);

				for (int i = 0; i < n1; i++)
				{
					if (str1[i] != str2[i])
					{
						return false;
					}
				}	
					
						return true;
				
			}

			public static void main(String args[])
			{
				String str3 = "ranjit id";
				String str4 = "di tijnar";
				
				char ch1[]= str3.toCharArray();
				char ch2[]= str4.toCharArray();		
				
				if (areAnagram(ch1,ch2))
					System.out.println("The two strings are anagram of each other");
				else
					System.out.println("The two strings are not anagram of each other");
			}
		}

