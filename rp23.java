//P23: Abundant Number

import java.io.*;
import java.util.Scanner;

public class rp23
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if((num%i) == 0)
			{
				sum = sum + i;
			}
		}
		if(sum > num)
		{
			System.out.println(num + " is an Abundant Number with Abundance " + (sum-num));
		}
		else
		{
			System.out.println(num + " is Not an Abundant Number");
		}
	}
}