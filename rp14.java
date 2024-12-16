//P14: Armstrong Number

import java.io.*;
import java.util.Scanner;

public class rp14
{
    public static void main(String args[])
	{
		int num,count=0,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		num = s.nextInt();
		int num1 = num;
		int num2 = num;
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
		    System.out.println(num2 + " is a Armstrong Number");
		}
		else
		{
			System.out.println(num2 + " is Not a Armstrong Number");
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