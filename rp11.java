//P11: Sum of Digits of a Number

import java.io.*;
import java.util.Scanner;

public class rp11
{
    public static void main(String args[])
	{
		int num,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		num = s.nextInt();
		int num1 = num;
		while(num>0)
		{
			sum = sum + (num%10);
			num = num/10;
		}
		System.out.println("The Sum of Digits of " + num1 + " is = " + sum);
	}
}