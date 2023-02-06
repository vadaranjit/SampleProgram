package package3;

public class Sample4 {
	private int a = 10;
	private void test()
	{
		System.out.println("methode-private");
	}
	Sample4() 
	{
		System.out.println("contructor-private");
	}
	
	public static void main(String args[]) 
	{
	System.out.println("Package3-sample4-private");
	Sample4 p = new Sample4();
	p.test();
	System.out.println(p.a);
	}

}
