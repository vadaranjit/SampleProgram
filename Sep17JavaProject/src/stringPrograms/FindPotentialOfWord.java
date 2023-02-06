package stringPrograms;
//10.Java program to find the potential of a word is found by adding the ASCII value of the alphabets
//some extra task added on this program
public class FindPotentialOfWord {
	public static void main(String args[])
	{
	String str = "i am ranjit very big fan big";
	System.out.println("Orignal String = "+str); 
	String []words = str.split(" ");
	int temp[] = new int[words.length];
	int count = 0;
	System.out.print("ASCII value  =   ");
	
	for(int i = 0; i<words.length; i++) 
	{
		for(int k=0; k<words[i].length(); k++) 
		{	
			count = words[i].charAt(k) + count;	 
			
		}
		temp[i] = count; 
		System.out.print(temp[i]+",");
		
		count = 0;
	}
	System.out.println();

	String demo = "";
	int demo1 =0;
	
    //Sort the array & string in ascending order    
    for (int i = 0; i < temp.length; i++) 
    {     
        for (int j = i+1; j < temp.length; j++)
        {     
           if(temp[i] > temp[j]) 
           {    
        	   demo1 = temp[i];    
               temp[i] = temp[j];    
               temp[j] = demo1;
               
               demo = words[i]; 
               words[i] = words[j];  
               words[j] = demo;    
           }  
           demo ="";
        }       
    }
    
    System.out.println();
    System.out.println();
    System.out.print("Sorted ASCII  =  ");
    
    for (int i = 0; i < temp.length; i++)
    {     
        System.out.print(temp[i] + " ");    
    }
    
    System.out.println();
    
    System.out.print("Sorted String =  ");
    for (int i = 0; i < words.length; i++)
    {     
        System.out.print(words[i] + " ");    
    } 
}
}