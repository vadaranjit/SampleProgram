package abstractionPackage;

public abstract class BmwCar extends Car {

	@Override
	public void start() {
		
		System.out.println("Start car");
	}

	@Override
	protected void stop() {
		System.out.println("Stop car");
		
	}

	@Override
	void run() {
		System.out.println("Run car");
		
	}
	
	public abstract void fule();
	public abstract void tank();

}
