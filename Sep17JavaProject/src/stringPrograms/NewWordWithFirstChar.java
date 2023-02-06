package stringPrograms;
//6.Java program to from a new word by extracting the first letter of each word in the entered sentence
public class NewWordWithFirstChar {
	public static void main(String[] args) 
	{
//using Normal method
			String str = "Java And Manual";	 
			String s = "";		    
			char[] ch = str.toCharArray();
		       		
		        for (int i = 0; i < ch.length; i++) 
		        {	           
		            int k = i;
		            while (i < ch.length && ch[i] != ' ') 	
		            { 
		            	i++;
		            }        
		            s = s + ch[k]; 
		        }
		        
		        System.out.println(s);
		        
//using split method
		        
		        String temp ="";
		        String nw = "";	        
		        String[] sc = str.split(" ");
		        for (int i = 0; i < sc.length; i++) 
		        {
		        	temp = sc[i].charAt(0)+"";
		        	nw = nw+temp; 	
		        }   
		        System.out.println("using split method = "+nw);
		        
	}
}

