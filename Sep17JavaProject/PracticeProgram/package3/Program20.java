package package3;

public class Program20 {
	public static void main(String[] args) 
	{
		String sc = "ABCDEFGHIJK";
		String str = "";
		for(int i = 1; i<sc.length();i++) 
		{
			str = ""+ sc.charAt(0) + sc.charAt(i);
			System.out.println(str);
		}
	
	}
	
}
