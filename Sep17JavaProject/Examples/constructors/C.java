package constructors;

import java.util.ArrayList;

public class C {
	public static void main(String[] args)
	{
	ArrayList ar = new ArrayList();
	ar.add("Nirobi");
	ar.add("Tokyo");
	ar.add("Denver");
	ar.add("Berlin");
	ar.add("Nirobi");
	System.out.println(ar);
	System.out.println(ar.size()); //5
	System.out.println(ar.indexOf("Nirobi")); //0
	System.out.println(ar.lastIndexOf("Nirobi")); //4

	// Modify or Update information

	ar.set(4, "Helsinki");
	System.out.println("Upadted ar = "+ar);
	}
}
