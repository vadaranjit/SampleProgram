package package4;

public class Default1 
{
	int x = 12;
	void def() 
	{
		System.out.println("default- methode");
	}
	Default1()
	{
		System.out.println("default- constructor");
	}
	public static void main(String args[])
	{
		Default1 de = new Default1();
		de.def();
		System.out.println(de.x);
	}
}
