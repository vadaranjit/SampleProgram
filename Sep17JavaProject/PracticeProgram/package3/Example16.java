package package3;  
public class Example16 {
	
		    public static void main(String[] args)
		    {
		        String str = "velocity 17 Sep";
		        char[] ch = str.toCharArray();  
		        String word = "";
		        for (int i = 0; i < ch.length; i++) 
		        {	           
		            int k = i;
		            while (i < ch.length && ch[i] != ' ')
		            { 
		            	i++;
		            	word = word + str.charAt(i);
		            	
		            }           
		            char character = ch[k];
		            if(character=='a' || character=='A' || character=='e' || character=='E' ||
		                    character=='i' || character=='I' || character=='o' || character=='O' ||
		                    character=='u' || character=='U')
		            {
		            	System.out.println(word);
		            	
		            		word = "";
		            }
		            
		            else 
		            	word = "";
		        }
		        System.out.println(ch);
		    }
		}

    
