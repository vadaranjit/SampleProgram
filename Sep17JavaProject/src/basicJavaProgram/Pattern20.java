package basicJavaProgram;

public class Pattern20 {
	public static void main(String[] args)
    {
      
        int rows =5;
        
       
        
        for (int i=rows; i>=1; i--)
        {
                                                                // Print star in decreasing order
            for (int j=1; j <=(i * 2) -1; j++)
            {
                if( j == 1 || j == (i * 2) -1 || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
                                                                // Print space in increasing order
            for (int k = rows; k >= i; k--)
            {
                System.out.print(" ");
            }
            
        }
    }

}
