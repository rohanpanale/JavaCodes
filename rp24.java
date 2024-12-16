//P24: Friendly Pair

import java.io.*;
import java.util.Scanner;

public class rp24
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Integer: ");
		int num1 = s.nextInt();
		System.out.println("Enter Second Integer: ");
		int num2 = s.nextInt();
		float sum1 = 0, sum2 = 0;;
		for(int i=1;i<=num1;i++)
		{
			if((num1%i) == 0)
			{
				sum1 = sum1 + i;
			}
		}
		for(int i=1;i<=num2;i++)
		{
			if((num2%i) == 0)
			{
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		if((sum1 > num1) && (sum2 > num2))
		{
			float index1 = sum1/num1;
			float index2 = sum2/num2;
			if(index1 == index2)
			{
				System.out.println(num1 + " and " + num2 + " are in Friendly Pair with Abundancy Ratio " + index1);
			}
			else
			{
				System.out.println(num1 + " and " + num2 + " are Not in Friendly Pair");
			}
		}
		else
		{
			System.out.println(num1 + " and " + num2 + " are Not in Friendly Pair");
		}
	}
}