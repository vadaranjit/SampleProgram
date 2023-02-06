package interfaceExamples;

public class Example1 {

	public static void main (String[]args)
	{
		int a=0;
		int b=1;
		int c=0;
		int count=10;
		
		for(int i = 1; i <=count; i++)
		{
			System.out.print(c+ " ,");
			c=a+b;
			b=a;
			a=c;
			//a = b;
			//b = c;
					
		}
}

}
