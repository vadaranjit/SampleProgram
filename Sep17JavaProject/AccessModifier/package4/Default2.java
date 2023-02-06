package package4;

public class Default2 {
	public static void main(String args[])
	{	System.out.println("calling from default 2 ");
		Default1 d = new Default1();
		d.def();
		System.out.println(d.x);
	}
}
