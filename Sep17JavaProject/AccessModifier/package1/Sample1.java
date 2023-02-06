package package1;

public class Sample1 
{
	
	public int a = 10;
	public void test()
	{
		System.out.println("methode");
	}
	public Sample1() 
	{
		System.out.println("contructor");
	}
	public static void main(String args[]) 
	{
		System.out.println("Package1-sample1");
		Sample1 obs = new Sample1();
		obs.test();
		System.out.println(obs.a);
	}
}
