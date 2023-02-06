package stringPrograms;
//27.reverse sentence in java
public class RevSentance1 {

	public static void NormalMethod()
		 {	     
			 	String str = "i am ranjit";
		        str = str+ " ";
		        String word = "";
		        String rev = "";
		        for(int i=0;i<str.length();i++)
		        {
		            char ch = str.charAt(i);
		            
		            if(ch!=' ')
		            {
		                word = word + ch;
		            }
		           
		            else 
		            {
		                rev = word +" "+ rev; 
		                word="";
		            } 
		        }
		        System.out.println("Normal Method = "+rev);
		  }

	
	public static void SplitMethod()
					{
						String s1="i am ranjit";	
						String[] words= s1.split(" "); 
						String temp = "";

						for(int i = 0; i< words.length ;i++)
							{  
								temp = words[i] + " " + temp;  
							}  
						System.out.println("Split Method = "+temp);  
					}
	public static void main(String[] args) 
			{
				NormalMethod();
				SplitMethod();
			}
}
