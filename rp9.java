//P9: Prime Number

import java.io.*;
import java.util.Scanner;

public class rp9
{
    public static void main(String args[])
	{
		int num, count=0;
		System.out.println("Enter a Integer: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(int i=1;i<=num;i++)
		{
			if((num%i) == 0)
			{
				count++;
			}
		}
		if(count > 2)
		{
			System.out.println(num + " is a Not Prime Number");
		}
		else
		{
			System.out.println(num + " is a Prime Number");
		}
	}
}
