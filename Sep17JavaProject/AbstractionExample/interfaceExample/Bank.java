package interfaceExample;

public interface Bank {
	void balance();
	void deposit();
	default void withdraw()
	{
		System.out.println("Withdraw");
	}
	private void cash()
	{
		System.out.println("cash");
	}
	public static void demo()
	{
		System.out.println("demo");
	}
	
// this types of declaration not allowed
// protected void test() {}
// public void test() {}
// we cannot able to create constructor in in interface
}
