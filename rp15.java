//P15: Armstrong Number in given Range

import java.io.*;
import java.util.Scanner;

public class rp15
{
    public static void main(String args[])
	{
		int low,high;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Value of Range: ");
		low = s.nextInt();
		System.out.println("Enter Starting Value of Range: ");
		high = s.nextInt();
		System.out.println("Armstrong Numbers between " + low + " and " + high + " are: ");
		for(int i=low;i<=high;i++)
		{
			int num = i;
			int num1 = i;
			int num2 = i;
			int sum = 0;
			int count = 0;
			while(num > 0)
			{
				num = num/10;
				count++;
			}
			power p = new power();
			while(num1 > 0)
			{
				int temp = num1%10;
				sum = sum + (p.pow(temp,count));
				num1 = num1/10;
			}
			if(sum == num2)
			{
		    	System.out.println(num2);
			}
		}
	}
}

class power
{
	int pow(int a, int b)
	{
		int power=1;
		for(int i=1;i<=b;i++)
		{
			power = power * a;
		}
		return power;
	}
}