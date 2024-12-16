//P18: Power of a Number

import java.io.*;
import java.util.Scanner;

public class rp18
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Positive Integer: ");
		int num = s.nextInt();
		System.out.println("Enter the Power of " + num + " : ");
		int power = s.nextInt();
		power p = new power();
		System.out.println(num + " power to " + power + " is " + (p.pow(num,power)));
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