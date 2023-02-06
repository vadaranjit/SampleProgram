package ThisKeyWord;

public class A {
	
	A()
	{
		this(10);
		System.out.println("Default constructor");
	}
	
	A(int a)
	{	
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		A obj = new A();		
	}
}
