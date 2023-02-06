package basicJavaProgram;

public class Pattern18 {
	public static void main(String[] args)
    {
        
        int rows = 5;  
        for (int i=1; i<=rows; i++)
        {
                                                   // Print space in increasing order
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
                                                     // Print star in decreasing order
            for (int k=rows; k>=i; k--)
            {
                if( i == 1 || k == i || k == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
