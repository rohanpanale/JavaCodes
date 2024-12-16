//P37: Addition of two fractions

import java.io.*;
import java.util.Scanner;

public class rp37
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Numerator of Fraction 1: ");
		int n1 = s.nextInt();
		System.out.println("Enter Denominator of Fraction 1: ");
		int d1 = s.nextInt();
		System.out.println("Enter Numerator of Fraction 2: ");
		int n2 = s.nextInt();
		System.out.println("Enter Denominator of Fraction 2: ");
		int d2 = s.nextInt();
		
		if(d1 == d2)
		{
			int add = n1 + n2;
			System.out.println("Addition of " + n1 + "/" + d1 + " and " + n2 + "/" + d2 + " is " + add + "/" + d1);
		}
		else
		{
			lcm l = new lcm();
			int lcm = l.lcm(d1,d2);
			int temp1 = lcm/d1;
			int temp2 = lcm/d2;
			n1 = n1 * temp1;
			n2 = n2 * temp2;
			int add = n1 + n2;
			System.out.println("Addition of " + n1 + "/" + d1 + " and " + n2 + "/" + d2 + " is " + add + "/" + lcm);
		}
	}
}

class lcm
{
	int lcm(int num1, int num2)
	{
		int hcf = 0;
		for(int i=1;i<num1 && i<num2;i++)
		{
			if(((num1%i) == 0) && ((num2%i) == 0))
			{
				hcf = i;
			}
		}
		int lcm = (num1 * num2)/hcf;
		return lcm;
	}
}