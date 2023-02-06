package basicJavaProgram;

public class Pattern19 {
	public static void main(String[] args)
    {
       
        int rows = 5;
        for (int i=1; i<=rows; i++)
        {
        											// Print space in decreasing order
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            										// Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
     
    }

}
