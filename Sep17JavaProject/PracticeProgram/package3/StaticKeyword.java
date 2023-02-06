package package3;

public class StaticKeyword {
	 static int count = 0;
	
	void test1()
	{
		count = count + 1;
		System.out.println(count);
	}
	
	void test2()
	{
		count = count + 1;
		System.out.println(count);
	}
	
	void test3()
	{
		count = count + 1;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		StaticKeyword a = new StaticKeyword();
		StaticKeyword b = new StaticKeyword();
		StaticKeyword c = new StaticKeyword();
		a.test1();
		b.test2();
		c.test3();
	}

}
