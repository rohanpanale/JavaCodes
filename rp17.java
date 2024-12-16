//P17: Factorial of a Number

import java.io.*;
import java.util.Scanner;

public class rp17
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		int factorial = 1;
		for(int i=num;i>0;i--)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
