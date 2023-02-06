package package3;

public class RevStringWord {
	
	public static void main(String args []) 
	{
		String str = "My Name Is Ranjit";	
		String word =""; // my
		String rev = ""; //my name
		str = str + " ";
		
		for (int i = 0;i< str.length();i++)
		{
			char ch = str.charAt(i); 
			 if (ch != ' ')
			 {
				 word = word + ch;
			 }
			 else 
			 {
				 rev = word + " " + rev;
				 word = "";
			 }
						 
		} 
		System.out.println(rev);
		
	}
	
}
