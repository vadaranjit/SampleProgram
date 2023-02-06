package stringPrograms;
import java.io.*;
//15.Java program to accept date in dd mm yyyy format and check whether it is valid date or not
public class CheckWhetherValidDateOrNot {

			static int MAX_VALID_YR = 9999;
			static int MIN_VALID_YR = 1800;


			static boolean isLeap(int year)
			{

				return (((year % 4 == 0) &&
						(year % 100 != 0)) ||
						(year % 400 == 0));
			}


			static boolean isValidDate(int d,int m,int y)
			{
	
				if (y > MAX_VALID_YR || y < MIN_VALID_YR)
					return false;
				if (m < 1 || m > 12)
					return false;
				if (d < 1 || d > 31)
					return false;

				if (m == 2)
				{
					if (isLeap(y))
						return (d <= 29);
					else
						return (d <= 28);
				}


				if (m == 4 || m == 6 || m == 9 || m == 11)
					return (d <= 30);

					return true;
			}

			public static void main(String args[])
			{
				if (isValidDate(10, 1, 2000))
					System.out.println("Date is Valid");
				else
					System.out.println("Date is No");
				
			}

	}

