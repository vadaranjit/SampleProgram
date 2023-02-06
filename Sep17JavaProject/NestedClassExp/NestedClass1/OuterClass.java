package NestedClass1;

public class OuterClass // this is outer class-only public, abstract or final are permitted
{
	final class InnerClass //THis is nested class/inner class-public,abstract,final,protected or private are permitted
	{
		public void Display() 
		{
			System.out.println("This is InnerClass");
		}			
	}
	
	public void Display() 
	{
		System.out.println("This is OuterClass");
		InnerClass innerc = new InnerClass(); //  inner class obj
		innerc.Display();
	}
	
	public static void main(String[] args)  
	{
		OuterClass outerc = new OuterClass(); //outer class obj
		outerc.Display();	
	}
}
