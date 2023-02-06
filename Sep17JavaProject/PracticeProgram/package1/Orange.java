package package1;

public class Orange {
	
	public static void main(String args[])
	{	System.out.println("calling from Orange class");
		Apple x = new Apple();
		System.out.println();	
// CALLING PUBLIC DATA
		System.out.println("CALLING PUBLIC DATA");
		System.out.println(x.p);
		x.a();
		System.out.println();
// CALLING DEFAULT DATA
		System.out.println("CALLING DEFAULT DATA");
		System.out.println(x.r);
		x.c();
		System.out.println();
// CALLING PROTECTED DATA
		System.out.println("CALLING PROTECTED DATA");
		System.out.println(x.s);
		x.d();
		System.out.println();				
	}

}
   