package basicJavaProgram;

public class Pattern13 {
	public static void main(String[] args)
    {
		int rows = 5;
		
			for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 2; j <=i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
