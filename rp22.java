//P22: Harshad Number

import java.io.*;
import java.util.Scanner;

public class rp22
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		int num1=num,sum = 0;
		while(num>0)
		{
			sum = sum + (num%10);
			num = num/10;
		}
		if((num1%sum) == 0)
		{
			System.out.println(num1 + " is a Harshad Number");
		}
		else
		{
			System.out.println(num1 + " is Not a Harshad Number");
		}
	}
}