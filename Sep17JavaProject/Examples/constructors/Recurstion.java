package constructors;

public class Recurstion 
{
	 public static void main(String[] args) 
	 {
		    int result = sum(1000); 	 
	 }
		  
	 public static int sum(int k) 
	  {
	 	 if (k > 0) 
		    { 
	 		  System.out.println(k);
		      return k + sum(k + 1);
		    } 
	 	 else 
		    {
		      return 0;
		    }
	  }
}