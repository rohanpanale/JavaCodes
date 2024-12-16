//P21: Automorphic Number

import java.io.*;
import java.util.Scanner;

public class rp21
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		int num1 = num, num2 = num;
		int sq = num * num;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		while((num1%10) == (sq%10))
		{
			num1 = num1/10;
			sq = sq/10;
			count--;
		}
		if(count == 0)
		{
			System.out.println(num2 + " is Automorphic");
		}
		else
		{
			System.out.println(num2 + " is Not Automorphic");
		}
	}
}



