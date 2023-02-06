package package3;
import java.lang.Math;
public class YogeshP {
	public static void main(String args [])
	{
	int num =1634;
	int temp = num;
	int power=0;
		while(temp>0)
		{
		temp = temp/10;
		power++;
		}
		
		System.out.println("Power of number is = "+power);
		temp = num;
		int sum = 0;
		while(temp>0)
		{
			int last = temp%10;
			sum +=  (Math.pow(last, power));
			temp = temp/10;
		}		
		if (sum == num)
			System.out.println("Given Number is Armstrong = "+sum);
		else 
			System.out.println("Given Number is not Armstrong = "+sum);
	}
}
