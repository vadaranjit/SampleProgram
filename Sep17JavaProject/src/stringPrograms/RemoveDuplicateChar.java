package stringPrograms;
//3.Java program to remove duplicate character from string
public class RemoveDuplicateChar {

	public static void main(String[] args) 
	{
			String str = "aaabbbbhjjhjvhhjhhhkhkkccccddd";
			char[] ch = str.toCharArray();
			String s = "";
			
			for (int i = 0 ;i < str.length();i++ ) 
			{
				int temp = i;
				for (int j = 0 ;j < str.length();j++ ) 
				{	 
					if(temp == j)
						{  
							;
						}
					else 
					{
						if(ch[temp] == str.charAt(j))
							{
								ch[j] = ' ';
							}
					}
						
				}
			}
			
			for(int i= 0;i<ch.length;i++) 
			{ 
				if(ch[i] == ' ') 
					{
						continue;
					}
				else
					s = s + ch[i];
				
			}
				System.out.println(s);
			}
	
		
	}

