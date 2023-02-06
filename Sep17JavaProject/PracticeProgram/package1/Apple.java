package package1;

public class Apple {
	// all veriables
	 public int p = 10;
	 private int q = 11;
	 int r = 15;
	 protected int s = 20;
	 
	 // all methods
	 public void a()
	 {
		 System.out.println("public method");
	 }
	 private void b()
	 {
		 System.out.println("private method");
	 }
	  void c()
	 {
		 System.out.println("default method");
	 }
	 protected void d()
		 {
			 System.out.println("protected method");
		 }
	 
	 //contructor
	 
	 public Apple() 
	 {
		 System.out.println("contructor calling");
	 }
	public static void main(String[] args)
	{
		Apple obs = new Apple();	
		System.out.println("calling from main method");
		System.out.println();
		System.out.println(obs.p);
		System.out.println(obs.q);
		System.out.println(obs.r);
		System.out.println(obs.s);
		obs.a();
		obs.b();
		obs.c();
		obs.d();
	}

}

