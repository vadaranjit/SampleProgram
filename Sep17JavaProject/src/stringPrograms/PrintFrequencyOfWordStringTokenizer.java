package stringPrograms;
//20.Java program to find the frequency of word present in string by using String Tokenizer
import java.util.StringTokenizer;

public class PrintFrequencyOfWordStringTokenizer {

	public static void main(String[] args) {
			   StringTokenizer st = new StringTokenizer("my name name name is is is khan");  
			    int num = st.countTokens();
			    String str[] = new String[num];
			    int count = 1;
			    
			    for(int i =0;i<=num-1;i++) 
				   {  
				   	str[i] = st.nextToken();
				   }
			    System.out.println("Frequency of word");
				for(int j=0; j < num ;j++) 
				{
					for(int i = j+1;i<num;i++) 
					{
						if(str[j].equals(str[i])) 
						{
							count++;
							str[i]=" ";
						}					
					}
					
					if(count > 0)
					{
						if(str[j].contains(" "))
							{
							count = 1;
							}
						else
							{
							System.out.println(str[j]+"\t"+" : "+count);
							count = 1;
							}
					}
				}			    
		}
	}
	
