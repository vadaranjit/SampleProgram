package basicJavaProgram;

public class Pattern17 {
	public static void main(String[] args)
    {
		int rows = 5;
        for (int i=1; i<=rows; i++)
        {
                                                       // Print star in decreasing order
            for (int j=rows; j >=i; j--)
            {
                if( i == 1 || j == i || j == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                                                            // Print space in increasing order
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }

    }

}
