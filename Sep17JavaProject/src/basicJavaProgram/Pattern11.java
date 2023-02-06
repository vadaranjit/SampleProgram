package basicJavaProgram;

public class Pattern11 {
	public static void main(String[] args)
    {
        int rows = 11;  
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
                                                           // Print star in decreasing order
            for (int k = 1; k <= rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
