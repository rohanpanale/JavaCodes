//P12: Reverse of a Number

import java.io.*;
import java.util.Scanner;

public class rp12
{
    public static void main(String args[])
	{
		int num,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		num = s.nextInt();
		int num1 = num;
		while(num>0)
		{
			int temp = num%10;
			rev = (rev*10) + temp;
			num = num/10;
		}
		System.out.println("The Reverse of " + num1 + " is " + rev);
	}
}