//P20: Perfect Number

import java.io.*;
import java.util.Scanner;

public class rp20
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
		if(sum == num)
		{
			System.out.println(num + " is a Perfect Number");
		}
		else
		{
			System.out.println(num + " is Not a Perfect Number");
		}
	}
}