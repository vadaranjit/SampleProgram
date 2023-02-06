package package3;
import java.lang.Math;
import java.util.Scanner;

public class Ranjit {
	static int getPower(int num) 
	{	
		int power = 0;
		while(num>0) 
		{
			num = num/10;
			power = power + 1;
		}
		return power;
	}
	
	static int isArmstrong(int num,int power) 
	{	int sum = 0;
		while(num>0)
		{
			int last = num%10;
			num = num/10;
			sum +=  (Math.pow(last, power));   
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int num = sc.nextInt();
		int power = getPower(num);
		int result = isArmstrong(num,power);
		if (result == num)
			System.out.println("Given Number is Armstrong = "+result);
		else 
			System.out.println("Given Number is not Armstrong = "+result);
	}

}
