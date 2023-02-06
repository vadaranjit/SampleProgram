package stringPrograms;
//16.Java program to arrange the sentence in alphabetical order of the words
public class SentenceInAlphabeticalOrder 
{

	public static void main(String[] args) 
	{
		String str = "ball Bat Dog Jet Mat Cat Apple india electronics Friend Engine";
		String []names= str.toUpperCase().split(" ");
		String []original= str.split(" ");
		String temp = "";
        for (int i = 0; i <names.length; i++)
        {
            for (int j = i + 1; j < names.length; j++) 
            {       
                if (names[i].compareTo(names[j]) > 0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
		
        }
        temp = "";
        for (int i = 0; i < names.length; i++) 
        {
//------------------------------------------------------------- 
           //Using this we can print all words in ORIGINAL FORMAT
           // 32 TO 38 LINES UNCOMMENTS AND COMMENT ONLY 41 LINE

//        	for(int x=0;x<names.length;x++) 
//        	{
//        		if(names[i].equalsIgnoreCase(original[x]))
//        		{
//        			temp = temp + original[x] + " ";
//        		}
//        	}
//-------------------------------------------------------------      	
        	//Using this we can print all words in UPPER case
        	temp = temp + names[i] + " "; 
        }
        
        System.out.println(temp);
        
	}
	
}
