package stringPrograms;
//24.Java program to find the largest and smallest word in sentence
public class LargestAndSmallestWord {

	public static void main(String[] args) {
		String s1="my name is ranjit";	
		String[] words= s1.split(" "); 
		String max = words[0];
		String min = words[0];
		
		for(int i = 0; i< words.length; i++) 
		{  
			if(max.length() <= words[i].length())
			{
				max = words[i];
			}
			if(min.length() >= words[i].length())
			{
	              min = words[i];  
			}	
		}
			System.out.println("Smallest Word: " + min);    
			System.out.println("Largest Word: " + max);
		}
	}

