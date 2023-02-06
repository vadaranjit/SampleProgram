package package3;

public class ArreysInJava {
	
/*  
*******************************  Arrays In Java  ************************************

Arrays in Java are like a list of elements of the same type 
i.e. a list of integers, a list of booleans etc. 

1) Creating an Array (method 1) - with new keyword

	int[] marks = new int[3];
	marks[0] = 97;
	marks[1] = 98;
	marks[2] = 95;

2) Creating an Array (method 2)

	int[] marks = {98, 97, 95};
	char[] arr = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };

*****************************************************************************************
 	Input  :  Hello World
	Output :  [H, e, l, l, o, W, o, r, l, d]
	
	Different Ways of Converting a String to Character Array
	
1) Using a naive approach via loops

		String str = "ranjit";
		char[] ch = new char[str.length()];
		ch[i] = str.charAt(i);
	
2) Using toChar() method of String class

      String str = "ranjit";
      char[] ch = str.toCharArray();
      
********************************************************************************************
*/
	public static void main(String[] args) 
	{
		/* int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		int[] num = {1,2,3,4,5};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		char[] arr = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]); */
		
		String str = "ranjit";
		System.out.println("String str =\""+str+"\";");
		char[] ch = new char[str.length()];
		
		for(int i = 0;i<str.length();i++) 
			{
				ch[i] = str.charAt(i);
			}
				System.out.print("char[] ch = {");
				for(int x = 0;x<str.length();x++) 
			{
				System.out.print("'"+ch[x]+"'"+""+ ",");
			}
				System.out.print("}"+";");
	}

}
