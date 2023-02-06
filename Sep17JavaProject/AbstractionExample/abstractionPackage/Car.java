package abstractionPackage;

public abstract class Car {
	
	public abstract void start();
	protected abstract void stop();
	abstract void run();
	
	public final void test() {
		System.out.println("final keyword");
	}
	public static void wheel() 
	{
		System.out.println("4 wheels");
	} 
	public void colour() 
	{
		System.out.println("blue colour");
	} 
	
}
