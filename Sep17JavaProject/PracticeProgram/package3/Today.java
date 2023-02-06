package package3;

public class Today {

	public static void main(String[] args)
	{
			
			String s= "My name is use or";
			String []s1 = s.split(" ");
			for (int i=0;i<s1.length; i++) 
			{
			String s2 = s1[i]; 
			char ch =s2.charAt(0);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
			{
				System.out.print(s1[i]+" ");
			}
			
			}

		}
//
	}
