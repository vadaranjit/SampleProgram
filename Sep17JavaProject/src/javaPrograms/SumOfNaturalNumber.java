package javaPrograms;

public class SumOfNaturalNumber
{  
public static void main(String[] args)   
{  
int i, num = 5, sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of " +num+ " Natural Numbers is = " + sum);  
}  
} //0+1+2+3+4+5 