package abstractionPackage;

public class BmwCar1 extends BmwCar {

	@Override
	public void fule() 
	{
		System.out.println("car fule");		
	}

	@Override
	public void tank() 
	{
		System.out.println("car tank");	
	}
	
	public static void main(String args[]) 
	{
		
		BmwCar1 obs = new BmwCar1();
		obs.run();
		obs.colour();
		obs.start();
		obs.fule();
		obs.test();
	}

}
