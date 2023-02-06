package basicJavaProgram;

public class Pattern8 { 
	public static void main(String[] args)
{
 
    int rows = 5;                                                   // Print i number of stars
    for (int i=1; i<=rows; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    for (int i=1; i<=rows-1; i++) 
    { 
                                                                   // Print star in decreasing order 
        for (int j = rows-1; j >= i; j--)
        {
            System.out.print("*");
        }
        
        System.out.println();
    }
}
}
